import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void addBook(Book book){
        if (!this.isFull()){
            this.books.add(book);
        }
    }

    public int countBooks(){
        return this.books.size();
    }

    public boolean isFull(){
        return (this.countBooks() == this.getCapacity());
    }

    public void removeBook(Book book){
        this.books.remove(book);
    }
}
