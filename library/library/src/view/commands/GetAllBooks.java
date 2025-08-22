package view.command;

public class GetAllBooks extends Command{
    public GetAllBooks(String description, ConsoleUI consoleUI) {
        super("Get all books", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().getAllBooks();
    }
}
