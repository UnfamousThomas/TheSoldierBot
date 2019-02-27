package Menus.RoleMenu;

import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.events.message.react.MessageReactionRemoveEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class onRoleMenuUnReact extends ListenerAdapter {
    @Override
    public void onMessageReactionRemove(MessageReactionRemoveEvent e) {
        if (!e.getUser().isBot()) {
            if(e.getChannel().equals(e.getGuild().getTextChannelById(549935901715726383L))) {
                if(e.getReactionEmote().getName().equals("\u0031\u20E3")) {
                    Role news = e.getGuild().getRoleById(542049304567611392L);
                    e.getGuild().getController().removeRolesFromMember(e.getMember(), news).queue();
                    e.getUser().openPrivateChannel().queue(privateChannel -> {
                        privateChannel.sendMessage(e.getMember().getAsMention() + ", you have been unassigned from the 'news' role.").queue();
                    });
                }
                if (e.getReactionEmote().getName().equals("\u0032\u20E3")) {
                    Role help = e.getGuild().getRoleById(542049303200399360L);
                    e.getGuild().getController().removeRolesFromMember(e.getMember(), help).queue();
                    e.getUser().openPrivateChannel().queue(privateChannel -> {
                        privateChannel.sendMessage(e.getMember().getAsMention() + ", you have been unassigned from the 'help' role.").queue();
                    });
                }
            }
        }
    }
}
