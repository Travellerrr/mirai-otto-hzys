package cn.travellerr.command

import cn.travellerr.Hzys
import cn.travellerr.OttoHzys
import cn.travellerr.util.Log
import net.mamoe.mirai.console.command.CommandContext
import net.mamoe.mirai.console.command.SimpleCommand
import net.mamoe.mirai.contact.Contact
import net.mamoe.mirai.message.data.MessageChain
import net.mamoe.mirai.message.data.SingleMessage

object GenerateHzys : SimpleCommand(OttoHzys.INSTANCE, "hzys", "电棍活字印刷", "活字印刷", "otto") {
    @Handler
    fun useVoice(sender: CommandContext, vararg args: String) {

        Log.info("活字印刷")

        val subject: Contact? = sender.sender.subject
        val message: MessageChain = sender.originalMessage

        Hzys.info(subject, message)
    }

    @Handler
    suspend fun useVoiceError(sender: CommandContext) {
        val subject: Contact? = sender.sender.subject
        val originMsg : SingleMessage = sender.originalMessage[1]
        val prefix = originMsg.toString().split(" ")[0]
        if (subject is Contact) {
            subject.sendMessage("请使用 \"$prefix [文本]\"生成，不要加括号")
        }
    }
}