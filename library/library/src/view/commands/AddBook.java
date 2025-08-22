package view.commands;

import view.ConsoleUI;

public class AddBook extends Command{
    public AddBook(ConsoleUI consoleUI){
        super("Add book to library",consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addBook();
    }
}
