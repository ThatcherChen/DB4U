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
            default:
                System.out.println("Error: Can not find meta command \"" + command + "\".");
                break;
        }
    }
}
