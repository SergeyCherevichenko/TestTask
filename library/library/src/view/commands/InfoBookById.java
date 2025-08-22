package view.commands;

import view.ConsoleUI;

public class InfoBookById extends Command{
    public InfoBookById(ConsoleUI consoleUI) {
        super("Get info book by id", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().infoBookById();
    }
}
