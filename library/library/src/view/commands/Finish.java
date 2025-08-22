package view.command;

public class Finish extends Command {
    public Finish(String description, ConsoleUI consoleUI) {
        super("Exit library", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().finish();
    }
}
