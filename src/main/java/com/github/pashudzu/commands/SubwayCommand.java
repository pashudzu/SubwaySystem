package com.github.pashudzu.commands;

import com.github.pashudzu.SubwaySystem;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.*;

public class SubwayCommand implements CommandExecutor, TabCompleter {
    private final SubwaySystem plugin;
    private final Map<String, BaseCommand> subCommands = new HashMap<>();

    public SubwayCommand(SubwaySystem plugin) {
        this.plugin = plugin;
        registerSubCommands();
    }

    private void registerSubCommands() {
        addCommand(new StationCommand(plugin));
        addCommand(new LineCommand(plugin));
        addCommand(new UpdateCommand(plugin));
        addCommand(new MapCommand(plugin));
    }

    private void addCommand(BaseCommand cmd) {
        subCommands.put(cmd.getName().toLowerCase(), cmd);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sendHelp(sender);
            return true;
        }

        String subCommandName = args[0].toLowerCase();

        if (subCommands.containsKey(subCommandName)) {
            BaseCommand subCommand = subCommands.get(subCommandName);
            String[] newArgs = Arrays.copyOfRange(args, 1, args.length);
            subCommand.execute(sender, newArgs);
        } else {
            sender.sendMessage(ChatColor.RED + args[0]);
            sender.sendMessage(ChatColor.GRAY + "Use /subway help for available commands.");
        }

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        return Collections.emptyList();
    }

    private void sendHelp(CommandSender sender) {}
}
