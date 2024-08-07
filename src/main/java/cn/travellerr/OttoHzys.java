package cn.travellerr;

import cn.travellerr.command.RegCommand;
import cn.travellerr.config.Config;
import cn.travellerr.util.Log;
import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;

import java.io.File;

public final class OttoHzys extends JavaPlugin {
    public static final OttoHzys INSTANCE = new OttoHzys();
    public static Config config;

    private OttoHzys() {
        super(new JvmPluginDescriptionBuilder("cn.travellerr.otto-hzys", "1.0.1")
                .name("otto-hzys")
                .author("Travellerr")

                .build());
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin loaded!");
        reloadPluginConfig(cn.travellerr.config.Config.INSTANCE);
        config = Config.INSTANCE;

        RegCommand regCommand = RegCommand.INSTANCE;
        regCommand.register();

        File file = new File("./temp/");
        if (!file.exists()) {
            Log.warning("临时文件夹不存在，开始创建");
            if (file.mkdirs()) {
                Log.info("临时文件夹创建成功");
            } else {
                Log.error("临时文件夹创建失败");
            }
        } else {
            if(file.isFile()) {
                Log.error("临时文件夹(temp)被同名称文件所使用,请删除主目录下的temp文件,并手动创建temp文件夹!");
            }
        }

    }
}