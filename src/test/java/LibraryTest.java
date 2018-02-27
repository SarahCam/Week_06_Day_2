import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        library = new Library(10);
        book1 = new Book("The Loney");
        book2 = new Book("Girl on the Train");
        book3 = new Book("The Exorcist");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(10, library.getCapacity());
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.countBooks());
    }

    @Test
    public void checkIsFull(){
        for(int i = 0; i < library.getCapacity(); i++){
            library.addBook(book1);
        }
        assertEquals(10, library.countBooks());
        assertEquals(true, library.isFull());
    }

    @Test
    public void canAddBook__only_if_space_in_library(){
        for(int i = 0; i < library.getCapacity(); i++){
            library.addBook(book1);
        }
        library.addBook(book2);
        assertEquals(10, library.countBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.countBooks());
        library.removeBook(book2);
        assertEquals(2, library.countBooks());
    }

}
