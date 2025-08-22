package view.commands;

import view.ConsoleUI;

public class DeleteBookById extends Command{
    public DeleteBookById( ConsoleUI consoleUI) {
        super("Remove book by id", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().deleteBookById();
    }
}
