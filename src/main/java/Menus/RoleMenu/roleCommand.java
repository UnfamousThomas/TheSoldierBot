package Menus.RoleMenu;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.TextChannel;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class roleCommand extends Command {
    public roleCommand() {
        this.name = "role";
        this.aliases = new String[] {"roles"};
        this.userPermissions = new Permission[] {Permission.MANAGE_CHANNEL};
        this.help = "A command for making the role message appear in the roles channel. | Only people with manage channel permission.";
    }
    @Override
    protected void execute(CommandEvent e) {
        e.getMessage().delete().queueAfter(1, TimeUnit.MINUTES);
        TextChannel c = e.getJDA().getGuildById(535541526709796864L).getTextChannelById(549935901715726383L);
        EmbedBuilder b = new EmbedBuilder();
        b.setTitle("Roles",null);
        b.setColor(new Color(255, 138, 53));
        b.addField("React with :one: to receive the NEWS role.", "", false);
        b.addField("React with :two: to receive the HELP role.", "", false);
        b.setFooter("The Imperium™", "https://i.imgur.com/j0w8RaW.png");
        c.sendMessage(b.build()).queue(message -> {
            message.addReaction("\u0031\u20E3").queue(); //1
            message.addReaction("\u0032\u20E3").queue(); //2
        });
    }

}

