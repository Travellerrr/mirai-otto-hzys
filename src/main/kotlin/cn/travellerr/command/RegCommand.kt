package cn.travellerr.command

import net.mamoe.mirai.console.command.CommandManager

object RegCommand {
    fun register() {
        CommandManager.registerCommand(GenerateHzys)
    }
}