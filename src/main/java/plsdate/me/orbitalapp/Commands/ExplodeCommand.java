package plsdate.me.orbitalapp.Commands;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import plsdate.me.orbitalapp.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.*;

public class ExplodeCommand implements TabExecutor {

    private final Main main;

    public ExplodeCommand(Main main) {
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
            Entity tnt = target.getWorld().spawnEntity(target.getLocation(), EntityType.PRIMED_TNT);
            TNTPrimed tnt2 = (TNTPrimed) tnt;
            tnt2.setFuseTicks(1);
            Entity tnt3 = target.getWorld().spawnEntity(target.getLocation(), EntityType.PRIMED_TNT);
            TNTPrimed tnt4 = (TNTPrimed) tnt3;
            tnt4.setFuseTicks(1);
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aSuccessfully exploded them with tnt!"));
        } catch (Exception exception) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou must provide a player to explode with tnt!"));
        }
        return true;
    }
}
