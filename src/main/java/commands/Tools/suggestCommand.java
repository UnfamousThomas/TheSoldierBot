package commands.Tools;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.TextChannel;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class suggestCommand extends Command {
    public suggestCommand() {
        this.name = "suggest";
        this.help = "Suggest features for the bot and guild | Aliases: s, su, suggestion, sugg";
        this.aliases = new String[]{"s","su","sugg","suggestion"};
        this.arguments = "<suggestion>";
        this.guildOnly = true;
    }
    @Override
    protected void execute(CommandEvent e) {
        String[] rarg = e.getMessage().getContentRaw().split(" ");
        TextChannel log = e.getGuild().getTextChannelById(536982786364669982L);
        String args= e.getArgs();
        EmbedBuilder b = new EmbedBuilder();
        b.setTitle("Suggestion",null);
        b.setColor(new Color(255, 138, 53));
        b.addField("Message:", args, false);
        b.addField("Author", e.getMember().getAsMention(), false);
        b.setFooter("The Imperium™", "https://i.imgur.com/j0w8RaW.png");

        if(rarg.length >= 2) {


    e.getGuild().getTextChannelById(536982786364669982L).sendMessage(b.build()).queue();
    e.getChannel().sendMessage("Your suggestion has been sent, " + e.getMember().getAsMention()).queue(message -> message.delete().queueAfter(2, TimeUnit.MINUTES));
    e.getMessage().delete().queueAfter(30, TimeUnit.SECONDS);
    } else {
            e.getChannel().sendMessage("Invalid usage. Do .help for more information.").queue();
        }
}}
