package cn.travellerr;

import cn.travellerr.command.RegCommand;
import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
import net.mamoe.mirai.event.Event;
import net.mamoe.mirai.event.EventChannel;
import net.mamoe.mirai.event.GlobalEventChannel;

public final class OttoHzys extends JavaPlugin {
    public static final OttoHzys INSTANCE = new OttoHzys();

    private OttoHzys() {
        super(new JvmPluginDescriptionBuilder("cn.travellerr.otto-hzys", "0.1.0")
                .name("otto-hzys")
                .author("Travellerr")

                .build());
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin loaded!");

        RegCommand regCommand = RegCommand.INSTANCE;
        regCommand.register();

    }
}