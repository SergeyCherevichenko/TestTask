package library_model;

public class BookBuilder {

    private static int nextId = 1;

    public Book bookBuild(String name, String author){
        Book book = new Book(nextId ++,name,author);
        return book;
    }
}
