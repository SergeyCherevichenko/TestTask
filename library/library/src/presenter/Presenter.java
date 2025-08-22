package presenter;

import library_model.Library;
import view.View;

public class Presenter {
    View view;
    Library library;

    public Presenter(View view){
        this.view = view;
        this.library = new Library();
    }

    public void addBook( String name, String author){
        library.addBook(name,author);
    }
    public String getAllBooks(){
        return library.getAllBooks();
    }
    public String infoBook(int id){
        return library.getBook(id);
    }
    public boolean deleteBook(int id){
        return library.deleteBook(id);
    }
}
