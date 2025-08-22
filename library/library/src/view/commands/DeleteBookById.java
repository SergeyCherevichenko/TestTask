package view.command;

public class DeleteBookById extends Command{
    public DeleteBookById(String description, ConsoleUI consoleUI) {
        super("Remove book by id", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().removeBookById();
    }
}
