package cn.travellerr.util;

import cn.hutool.json.JSONParser;
import cn.travellerr.Hzys;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static cn.travellerr.Hzys.DATA_FOLDER_PATH;

public class Replacer {
    private static final Map<String, String> EN_TO_CN = Stream.of(new String[][] {
            {"a", "诶"},
            {"b", "逼"},
            {"c", "赛"},
            {"d", "第"},
            {"e", "一"},
            {"f", "爱服"},
            {"g", "寄"},
            {"h", "爱吃"},
            {"i", "爱"},
            {"j", "勾"},
            {"k", "开"},
            {"l", "爱楼"},
            {"m", "爱慕"},
            {"n", "嗯"},
            {"o", "哦"},
            {"p", "屁"},
            {"q", "酷"},
            {"r", "阿"},
            {"s", "艾斯"},
            {"t", "踢"},
            {"u", "有"},
            {"v", "微"},
            {"w", "打不溜"},
            {"x", "艾克斯"},
            {"y", "歪"},
            {"z", "贼"}
    }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

    private static final JsonObject YSDD_TABLE;
    static {
        try (InputStreamReader reader = new FileReader(DATA_FOLDER_PATH+"/ysddTable.json")) {
            YSDD_TABLE = JsonParser.parseReader(reader).getAsJsonObject();
        } catch (Exception e) {
            throw new RuntimeException("Failed to load ysddTable.json in "+DATA_FOLDER_PATH+"/ysddTable.json", e);
        }
    }


    public static String replaceNonChinese(String input) {
        return input.replaceAll("[^\\u4E00-\\u9FA5]", "");
    }

    public static String replaceEnglishToChinese(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            String key = String.valueOf(c).toLowerCase();
            if (EN_TO_CN.containsKey(key)) {
                result.append(EN_TO_CN.get(key));
            } else {
                result.append(c);
            }
        }
        System.out.println("result:"+result);
        return result.toString();
    }

    public static String[] replaceYsdd(String[] input) {
        StringBuilder combinedInput = new StringBuilder();
        for (String s : input) {
            combinedInput.append(s).append(" ");
        }

        String result = combinedInput.toString().trim();
        for (Map.Entry<String, com.google.gson.JsonElement> entry : YSDD_TABLE.entrySet()) {
            result = result.replace(entry.getKey(), entry.getValue().getAsString());
        }

        return result.split(" ");
    }

}
