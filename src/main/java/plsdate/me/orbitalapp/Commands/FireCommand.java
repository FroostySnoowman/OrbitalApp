package plsdate.me.orbitalapp.Commands;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import plsdate.me.orbitalapp.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.*;

public class FireCommand implements TabExecutor {

    private final Main main;

    public FireCommand(Main main) {
        this.main = main;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return null;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        try {
            Player target = Bukkit.getPlayer(args[0]);
            target.setFireTicks(60);
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aSuccessfully lit them on fire!"));
        } catch (Exception exception) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou must provide a player to light on fire!"));
        }
        return true;
    }
}
