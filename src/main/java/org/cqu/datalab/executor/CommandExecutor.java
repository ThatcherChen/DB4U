package org.cqu.datalab.executor;

import org.cqu.datalab.utils.MetaDataAccessor;

public class CommandExecutor implements AbstractExecutor{
    private final String command;
    public CommandExecutor(String command) {
        this.command = command;
    }
    @Override
    public void execute() {
        switch (command) {
            case "exit":
                MetaDataAccessor metaDataAccessor = MetaDataAccessor.getAccessor();
                metaDataAccessor.sync();
                System.out.println("GoodBye!");
                System.exit(0);
                break;
            case "help":
                System.out.println("MetaCommand:");
                System.out.println("1. help");
                System.out.println("2. exit");
                System.out.println("3. settings");
                System.out.println();
                break;
            case "settings":
                System.out.println("Please check your terminal whether supports this feature.");
                break;
            default:
                System.out.println("Error: Can not find meta command \"" + command + "\".");
                break;
        }
    }
}
