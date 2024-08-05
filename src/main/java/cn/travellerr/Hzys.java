package cn.travellerr;

import cn.hutool.extra.pinyin.engine.pinyin4j.Pinyin4jEngine;
import cn.travellerr.util.Log;
import cn.travellerr.util.Replacer;
import net.mamoe.mirai.contact.Contact;
import net.mamoe.mirai.contact.AudioSupported;
import net.mamoe.mirai.message.data.Audio;
import net.mamoe.mirai.message.data.MessageChain;
import net.mamoe.mirai.utils.ExternalResource;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Hzys {
    static String ffmpeg = "./ffmpeg/ffmpeg";
    public static String DATA_FOLDER_PATH = OttoHzys.INSTANCE.getDataFolderPath().toString();
    public static void info(Contact subject, MessageChain message) {
        String code = message.serializeToMiraiCode();
        String[] name = code.split(" ");
        String newString = Arrays.stream(name, 1, name.length).collect(Collectors.joining());
        gen(newString, subject);
    }


    public static void gen(String msg, Contact subject) {
        try {
            Pinyin4jEngine engine = new Pinyin4jEngine();
            String input = Replacer.replaceEnglishToChinese(msg);
            input = Replacer.replaceNonChinese(input);
            String pinyin = engine.getPinyin(input, " ") + " ^s";
            String[] stringArray = Replacer.replaceYsdd(pinyin.split(" "));

            List<AudioInputStream> audioInputStreams = new ArrayList<>();
            AudioFormat targetFormat = null;

            System.out.println(Arrays.toString(stringArray));

            for (String s : stringArray) {
                AudioInputStream audioInputStream = loadAudioInputStream(s);
                audioInputStreams.add(audioInputStream);

                if (targetFormat == null) {
                    targetFormat = new AudioFormat(
                            AudioFormat.Encoding.PCM_SIGNED,
                            audioInputStream.getFormat().getSampleRate(),
                            audioInputStream.getFormat().getSampleSizeInBits(),
                            audioInputStream.getFormat().getChannels(),
                            audioInputStream.getFormat().getFrameSize(),
                            audioInputStream.getFormat().getFrameRate(),
                            audioInputStream.getFormat().isBigEndian()
                    );
                }
            }

            AudioFormat finalTargetFormat = targetFormat;
            List<AudioInputStream> convertedAudioInputStreams = audioInputStreams.stream()
                    .map(audioInputStream -> AudioSystem.getAudioInputStream(finalTargetFormat, audioInputStream))
                    .collect(Collectors.toList());

            AudioInputStream appendedFiles = new AudioInputStream(
                    new SequenceInputStream(Collections.enumeration(convertedAudioInputStreams)),
                    targetFormat,
                    -1);

            long time = System.currentTimeMillis();
            File outputFile = new File("./temp/" + time + ".wav");
            AudioSystem.write(appendedFiles, AudioFileFormat.Type.WAVE, outputFile);


            /*File f2 = new File("temp/"+time+".amr");
            exeCmd(ffmpeg, "-i", f.getAbsolutePath(), "-ab", "23.85k", "-ar", "16000",
                    "-ac", "1", "-acodec", "amr_wb", "-fs", "1000000", "-y", f2.getAbsolutePath());*/

            ExternalResource resource = ExternalResource.create(outputFile);
            Audio au = ((AudioSupported)subject).uploadAudio(resource);
            subject.sendMessage(au);
            resource.close();
            outputFile.delete();
            //f2.delete();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


        public static void gen(String msg) {
            try {
                Pinyin4jEngine engine = new Pinyin4jEngine();
                String input = Replacer.replaceEnglishToChinese(msg);
                input = Replacer.replaceNonChinese(input);
                String pinyin = engine.getPinyin(input, " ") + " ^s";
                String[] stringArray = Replacer.replaceYsdd(pinyin.split(" "));

                List<AudioInputStream> audioInputStreams = new ArrayList<>();
                AudioFormat targetFormat = null;

                System.out.println(Arrays.toString(stringArray));

                for (String s : stringArray) {
                    AudioInputStream audioInputStream = loadAudioInputStream(s);
                    audioInputStreams.add(audioInputStream);

                    if (targetFormat == null) {
                        targetFormat = new AudioFormat(
                                AudioFormat.Encoding.PCM_SIGNED,
                                audioInputStream.getFormat().getSampleRate(),
                                audioInputStream.getFormat().getSampleSizeInBits(),
                                audioInputStream.getFormat().getChannels(),
                                audioInputStream.getFormat().getFrameSize(),
                                audioInputStream.getFormat().getFrameRate(),
                                audioInputStream.getFormat().isBigEndian()
                        );
                    }
                }

                AudioFormat finalTargetFormat = targetFormat;
                List<AudioInputStream> convertedAudioInputStreams = audioInputStreams.stream()
                        .map(audioInputStream -> AudioSystem.getAudioInputStream(finalTargetFormat, audioInputStream))
                        .collect(Collectors.toList());

                AudioInputStream appendedFiles = new AudioInputStream(
                        new SequenceInputStream(Collections.enumeration(convertedAudioInputStreams)),
                        targetFormat,
                        -1);

                long time = System.currentTimeMillis();
                File outputFile = new File("./temp/" + time + ".wav");
                AudioSystem.write(appendedFiles, AudioFileFormat.Type.WAVE, outputFile);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private static AudioInputStream loadAudioInputStream(String fileName) throws IOException {
            try {
                return AudioSystem.getAudioInputStream(
                        new File(DATA_FOLDER_PATH +"/sources/" + fileName + ".wav")
                );
            } catch (Exception e1) {
                Log.info("Failed to load audio file: " + fileName + " in "+ DATA_FOLDER_PATH+"/sources/" + fileName + ".wav, starting to try ysddSources");
                try {
                    return AudioSystem.getAudioInputStream(
                            new File(DATA_FOLDER_PATH +"/ysddSources/" + fileName + ".wav")
                    );
                } catch (Exception e2) {
                    throw new IOException("Failed to load audio file: " + fileName + " in "+ DATA_FOLDER_PATH+"/ysddSources/" + fileName + ".wav", e2);
                }
            }
        }
}
