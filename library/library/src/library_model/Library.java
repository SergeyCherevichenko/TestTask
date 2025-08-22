package library_model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private BookBuilder bookBuilder;

    public Library(){
        this.books = new ArrayList<>();
        this.bookBuilder = new BookBuilder();
    }
    public void  addBook(String name, String author){
        Book book = bookBuilder.bookBuild( name,author);
        books.add(book);

    }
    public String getAllBooks() {
        if(books.isEmpty()){
            return "Library is Empty";
        }
        StringBuilder str = new StringBuilder();
        int i = 1;
        for (Book b : books) {
            str.append("№ ").append(i).append(". ").append(b.toString()).append("\n");
            i++;
        }
        return str.toString();
    }

    public String getBook(int id){
        if(books.isEmpty()){
            return "Library is Empty";
        }
        Book book = null;
        for(Book b : books){
            if(b.getId() == id){
                return  b.toString();
            }
        }
        return "There is no book in the library with this id.";
    }
    public boolean deleteBook(int id) {
        if (books.isEmpty()) {
            return false;
        }
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }


}
