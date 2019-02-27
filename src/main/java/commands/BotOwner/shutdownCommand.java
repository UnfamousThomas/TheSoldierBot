package commands.BotOwner;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

import java.util.concurrent.TimeUnit;

public class shutdownCommand extends Command {
    public shutdownCommand() {
        this.name = "shutdown";
        this.help = "Shut the bot down | Bot owner only";
        this.aliases = new String[] {"stop"};
        this.guildOnly = true;
    }
    @Override
    protected void execute(CommandEvent e) {
        if (e.getAuthor().getId().equalsIgnoreCase("206383620531683328")) {
            e.getChannel().sendMessage("Shutting down - boss!").queue();
            e.getJDA().shutdown();
        } else {
            e.getChannel().sendMessage("You are not the bot owner - " + e.getMember().getAsMention()).queue(message -> message.delete().queueAfter(2, TimeUnit.MINUTES));
        }
    }
}
