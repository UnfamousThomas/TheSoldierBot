package Menus.LevelMenu;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.TextChannel;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class lvlCommand extends Command {
public lvlCommand() {
    this.name = "level";
    this.aliases = new String[]{"lvl"};
}
    @Override
    protected void execute(CommandEvent e) {
        e.getMessage().delete().queueAfter(1, TimeUnit.MINUTES);
        TextChannel c = e.getJDA().getGuildById(535541526709796864L).getTextChannelById(550075592503066644L);
        EmbedBuilder b = new EmbedBuilder();
        b.setTitle("Level Roles",null);
        b.setColor(new Color(255, 138, 53));
        b.addField(":zero:", " to receive the 'lvl 0 - 9' role.", false);
        b.addField(":one:", " to receive the 'lvl 10 - 19' role", false);
        b.addField(":two:", "to receive the 'lvl 20 - 29' role.", false);
        b.addField(":three:", "to receive the 'lvl 30 - 39' role.", false);
        b.addField(":four:", "to receive the 'lvl 40 - 49' role.", false);
        b.addField(":five:", " to receive the 'lvl 50 - 59' role.", false);
        b.addField(":six:", " to receive the 'lvl 60 - 69' role.", false);
        b.addField(":seven:", " to receive the 'lvl 70 - 79' role.", false);
        b.addField(":eight:", " to receive the 'lvl 80 - 89' role.", false);
        b.addField(":nine:", " to receive the 'lvl 90 - 104' role.", false);

        b.setFooter("The Imperium™", "https://i.imgur.com/j0w8RaW.png");
        c.sendMessage(b.build()).queue(message -> {
            message.addReaction("\u0031\u20E3").queue(); //1
            message.addReaction("\u0032\u20E3").queue(); //2
            message.addReaction("\u0033\u20E3").queue(); //3
            message.addReaction("\u0034\u20E3").queue(); //4
            message.addReaction("\u0035\u20E3").queue(); //5
            message.addReaction("\u0036\u20E3").queue(); //6
            message.addReaction("\u0037\u20E3").queue(); //7
            message.addReaction("\u0038\u20E3").queue(); //8
            message.addReaction("\u0039\u20E3").queue(); //9+
            message.addReaction("\u0030\u20E3").queue();//0







        });
    }

}