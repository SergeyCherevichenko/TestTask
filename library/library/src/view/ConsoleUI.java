package view;

import presenter.Presenter;
import view.commands.MainMenu;

import java.util.Scanner;

public class ConsoleUI implements View {
    private Scanner scan;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        scan = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("This is a library application. Select one of the commands by the number below");
        while (work) {
            printMenu();
            choice();
        }
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

    private void choice() {
        int line = readInt("Enter menu number: ");
        if (line > 0 && line <= menu.size()) {
            menu.execute(line);
        } else {
            error();
        }
    }

    private void error() {
        System.out.println("There is no operation with this number.");
    }

    private void printMenu() {
        System.out.println(menu.menu());
    }

    public void finish() {
        System.out.println("See you soon");
        work = false;
    }

    public void addBook() {
        String name = readLine("Enter the name of the book: ");
        String author = readLine("Enter the author's name: ");
        presenter.addBook(name, author);
    }

    public void getAllBooks() {
        System.out.println(presenter.getAllBooks());
    }

    public void infoBookById() {
        int id = readInt("Enter book id: ");
        System.out.println(presenter.infoBook(id));
    }

    public void deleteBookById() {
        int id = readInt("Enter book id: ");
        System.out.println(presenter.deleteBook(id));
    }

    private int readInt(String message) {
        while (true) {
            System.out.print(message);
            if (scan.hasNextInt()) {
                int value = scan.nextInt();
                scan.nextLine(); // очищаем буфер
                return value;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scan.nextLine(); // сбрасываем неверный ввод
            }
        }
    }

    private String readLine(String message) {
        while (true) {
            System.out.print(message);
            String line = scan.nextLine().trim();
            if (!line.isEmpty()) {
                return line;
            } else {
                System.out.println("Input cannot be empty. Try again.");
            }
        }
    }
}
