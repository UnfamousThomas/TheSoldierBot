package commands.Admin;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import commands.Tools.messages;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageHistory;
import net.dv8tion.jda.core.entities.TextChannel;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class clearCommand extends Command {
    public clearCommand() {
        this.name = "clear";
        this.arguments = "<number of messages>";
        this.guildOnly = true;
        this.userPermissions = new Permission[]{Permission.MESSAGE_MANAGE};
        this.aliases = new String[]{"clean","c","purge"};
        this.help = "Clears the chat | Aliases: clean, c, purge | Elite 5 and above only.";
    }
    @Override
    protected void execute(CommandEvent e) {
        String[] args = e.getMessage().getContentRaw().split(" ");
        if (args.length == 2) {
        String getargs = e.getArgs();
        MessageHistory history = new MessageHistory(e.getTextChannel());
        List<Message> msgs;

        msgs = history.retrievePast(Integer.parseInt(args[1]) + 1).complete();
        //Add one to delete command.
        e.getTextChannel().deleteMessages(msgs).queue();
        e.getTextChannel().sendMessage(e.getMember().getAsMention() + ", " + args[1] + " messages have been deleted.").queue();
        String c = e.getTextChannel().getAsMention();

            TextChannel log = e.getGuild().getTextChannelById(536982786364669982L);
            EmbedBuilder be = new EmbedBuilder();
            be.setTitle("Clear",null);
            be.setColor(new Color(255, 138, 53));
            be.addField("Amount of messages:", args[1], false);
            be.addField("Deleter:", e.getMember().getAsMention(), false);
            be.addField("Channel:", c, false);
            be.setFooter("The Imperium™", "https://i.imgur.com/j0w8RaW.png");

            e.getGuild().getTextChannelById(536982786364669982L).sendMessage(be.build()).queue();
        } else {
            e.getChannel().sendMessage(messages.usage).queue();

            MessageHistory history = new MessageHistory(e.getTextChannel());
            List<Message> msgs;

            msgs = history.retrievePast(2).complete();
            e.getTextChannel().deleteMessages(msgs).queueAfter(1, TimeUnit.MINUTES);
        }
    }

    }
