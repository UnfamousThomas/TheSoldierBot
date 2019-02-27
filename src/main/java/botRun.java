import Menus.LevelMenu.lvlCommand;
import Menus.LevelMenu.onLvlMenuReact;
import Menus.LevelMenu.onLvlMenuUnreact;
import Menus.RoleMenu.OnRoleMenuReact;
import Menus.RoleMenu.onRoleMenuUnReact;
import Menus.RoleMenu.roleCommand;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import commands.Admin.clearCommand;
import commands.BotOwner.shutdownCommand;
import commands.Fun.birthdayCommand;
import commands.Fun.helloCommand;
import commands.Tools.suggestCommand;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;


public class botRun {
    public static void main(String[] args)  throws Exception
    {
        String secret = "NTQ1MzI4NzY5MzMwNzA4NDgx.D0YEmw.w9swzWljkyrRq3reNaangKhVItY";
        CommandClientBuilder client = new CommandClientBuilder();

        client.setPrefix(".");
        client.setOwnerId("206383620531683328");
        client.setStatus(OnlineStatus.IDLE);
        client.setGame(Game.playing("Wynncraft"));
        client.addCommands(
        new helloCommand(),
        new suggestCommand(),
        new birthdayCommand(),
        new clearCommand(),
        new shutdownCommand(),
        new roleCommand(),
        new lvlCommand()
        );



        new JDABuilder(AccountType.BOT)
                .setToken(secret)
                .setStatus(OnlineStatus.ONLINE)
                .addEventListener(client.build())
                .addEventListener(new OnRoleMenuReact())
                .addEventListener(new onRoleMenuUnReact())
                .addEventListener(new onLvlMenuReact())
                .addEventListener(new onLvlMenuUnreact())
                .build();
    }}
