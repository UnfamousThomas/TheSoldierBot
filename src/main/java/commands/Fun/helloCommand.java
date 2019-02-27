package commands.Fun;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.core.entities.Role;
public class helloCommand extends Command {
    public helloCommand() {
        this.name = "hello";
        this.help = "Says hello | Aliases: hey, hi, yo";
        this.guildOnly = false;
        this.aliases = new String[]{"hey", "hi", "yo"}; }
    @Override
    protected void execute(CommandEvent e) {
        String a = "206383620531683328";
        Role e5 = e.getGuild().getRoleById(536962560193331210L);
        Role c = e.getGuild().getRoleById(536963210239148062L);
        if (e.getAuthor().getId().equalsIgnoreCase(a)) { e.getChannel().sendMessage("OMG... My creator is here. Hey!").queue();
        } else if(e.getMember().getRoles().contains(e5)) { e.getChannel().sendMessage("Oh hey... it's you - " + e.getAuthor().getAsMention() + ". You are kind of important so hey!!!!!!").queue();
        } else if(e.getAuthor().getId().equalsIgnoreCase("229629898132684801")) { e.getChannel().sendMessage("Get on wynncraft lol...").queue();
        } else if (e.getAuthor().getId().equalsIgnoreCase("305106326030385153")) { e.getChannel().sendMessage("Good job... you said something on discord.").queue();
        } else if (e.getMember().getRoles().contains(c)) { e.getChannel().sendMessage("Hey there... GET TO WORK YOU BASTARD!").queue();
        } else { e.getChannel().sendMessage("oh... Hey there!").queue(); }}}
