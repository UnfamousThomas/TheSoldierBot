package Menus.LevelMenu;

import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.react.MessageReactionRemoveEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.managers.GuildController;

public class onLvlMenuUnreact extends ListenerAdapter {
    @Override
    public void onMessageReactionRemove(MessageReactionRemoveEvent e) {
        Role zero = e.getGuild().getRoleById(550455957541486604L);
        Role ten = e.getGuild().getRoleById(542646068714930188L);
        Role twenty = e.getGuild().getRoleById(542646205809688577L);
        Role thirty = e.getGuild().getRoleById(542646460127248384L);
        Role fourty = e.getGuild().getRoleById(542646512132423683L);
        Role fifty = e.getGuild().getRoleById(542646780324478986L);
        Role sixty = e.getGuild().getRoleById(542646930195480578L);
        Role seventy = e.getGuild().getRoleById(542647017944383490L);
        Role eighty = e.getGuild().getRoleById(543206570817880085L);
        Role ninety = e.getGuild().getRoleById(542647078052954112L);
        Role [] list = {ten, twenty, thirty, fourty, fifty, sixty, seventy, eighty, ninety, zero};

        if(e.getUser().isBot()) {
            return;
        }
        else {
            TextChannel c = e.getJDA().getGuildById(535541526709796864L).getTextChannelById(550075592503066644L);
            GuildController gc = e.getGuild().getController();
            Member target = e.getMember();

            if(e.getChannel().equals(c)) {
                if(e.getReactionEmote().getName().equals("\u0030\u20E3")) {
                    roleadd(target, "lvl 0 - 9", gc, e.getUser(), list);
                }
                if (e.getReactionEmote().getName().equals("\u0031\u20E3")) {
                    roleadd(target, "lvl 10-19", gc, e.getUser(), list); //add 10 - 19
                } if(e.getReactionEmote().getName().equals("\u0032\u20E3")) {
                    roleadd(target, "lvl 20-29", gc, e.getUser(),list); //add 20 - 29
                }
                if(e.getReactionEmote().getName().equals("\u0033\u20E3")) {
                    roleadd(target, "lvl 30 - 39", gc, e.getUser(), list);
                }
                if (e.getReactionEmote().getName().equals("\u0034\u20E3")) {
                    roleadd(target, "lvl 40 - 49", gc, e.getUser(), list);
                } if (e.getReactionEmote().getName().equals("\u0035\u20E3")) {
                    roleadd(target, "lvl 50 - 59", gc, e.getUser(), list);
                } if (e.getReactionEmote().getName().equals("\u0036\u20E3")) {
                    roleadd(target, "lvl 60 - 69", gc, e.getUser(), list);
                } if (e.getReactionEmote().getName().equals("\u0037\u20E3")) {
                    roleadd(target, "lvl 70 - 79", gc, e.getUser(), list);
                } if (e.getReactionEmote().getName().equals("\u0038\u20E3")) {
                    roleadd(target, "lvl 80 - 89", gc, e.getUser(), list);
                } if (e.getReactionEmote().getName().equals("\u0039\u20E3")) {
                    roleadd(target, "lvl 90 - 104", gc, e.getUser(), list);

                }

            }}



    }
    private void roleadd(Member target, String srank,  GuildController gc, User u, Role[] list) {
        gc.removeRolesFromMember(target, list).queue();
        u.openPrivateChannel().queue(privateChannel -> {
            privateChannel.sendMessage(target.getAsMention() + ", you have been unassigned from the '"+srank+"' role.").queue();
        });
    }
}
