package cn.travellerr;

import cn.travellerr.command.RegCommand;
import cn.travellerr.config.Config;
import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
public final class OttoHzys extends JavaPlugin {
    public static final OttoHzys INSTANCE = new OttoHzys();
    public static Config config;

    private OttoHzys() {
        super(new JvmPluginDescriptionBuilder("cn.travellerr.otto-hzys", "1.0.0")
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

    }
}