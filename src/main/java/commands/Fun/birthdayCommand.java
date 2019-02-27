package commands.Fun;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import commands.Tools.messages;

public class birthdayCommand extends Command {
    public birthdayCommand() {
        this.name = "birthday";
        this.aliases = new String[]{"bd"};
        this.help = "Sing a birthday song to someone! | Aliases: bd";
    }
    @Override
    protected void execute(CommandEvent e) {
        String[] args = e.getMessage().getContentRaw().split(" ");
        if(args.length == 2) {
            e.getChannel().sendMessage("Happy Birthday to You,\nHappy Birthday to You,\nHappy Birthday Dear " + args[1] + ",\nHappy Birthday to You.").queue();
        } else {
            e.getChannel().sendMessage(messages.usage).queue();
        }
    }
}
