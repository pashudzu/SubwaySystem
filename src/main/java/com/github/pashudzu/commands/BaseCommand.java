package com.github.pashudzu.commands;

import com.github.pashudzu.SubwaySystem;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Collections;
import java.util.List;

public abstract class BaseCommand {
    protected final SubwaySystem plugin;

    public BaseCommand(SubwaySystem plugin) {
        this.plugin = plugin;
    }

    public abstract String getName();

    public abstract void execute(CommandSender sender, String[] args);

    public List<String> tabComplete(CommandSender sender, String[] args) {
        return Collections.emptyList();
    }

    protected boolean isPlayer(CommandSender sender) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cOnly players can use this command!");
            return false;
        }
        return true;
    }

    protected boolean hasPermission(CommandSender sender, String permission) {
        if(!sender.hasPermission(permission)) {
            sender.sendMessage("§cYou don't have permission to use this command!");
            return false;
        }
        return true;
    }
}
