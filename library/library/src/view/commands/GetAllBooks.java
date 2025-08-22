package view.commands;

import view.ConsoleUI;

public class GetAllBooks extends Command{
    public GetAllBooks(ConsoleUI consoleUI) {
        super("Get all books", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().getAllBooks();
    }
}
