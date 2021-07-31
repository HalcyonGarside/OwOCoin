package apollyawn.OwOCoin;

import discord4j.core.object.entity.Guild;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {
        String[] args = event.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase(OwOCoin.prefix))
        {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("OwOCoin Bot Info");
            info.setDescription("I was created to make sure all of your online popularity is being monitored properly ya filthy animals");
            info.addField("Creator", "Apollo!", false);
            info.setColor(0x4d01ff);
            info.setFooter("Apollo's widdle baby", event.getMember().getUser().getAvatarUrl());

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();

//            event.getChannel().sendTyping().queue();
//            event.getChannel().sendMessage("dude i was just sipping this rad eye blood what do you want").queue();
        }
    }

}
