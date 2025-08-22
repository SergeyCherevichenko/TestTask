package view.command;

public class InfoBookById extends Command{
    public InfoBookById(String description, ConsoleUI consoleUI) {
        super("Get info book by id", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().infoBookById();
    }
}
