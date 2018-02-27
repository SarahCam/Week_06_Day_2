import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before(){
        this.borrower = new Borrower();
        this.library = new Library(10);
        this.book = new Book("The Loney");
    }

    @Test
    public void canGetBookCount(){
        assertEquals(0, this.borrower.getBookCount());
    }

    @Test
    public void canBorrowBook(){
        this.library.addBook(this.book);
        this.borrower.borrowBook(this.library, this.book);
        assertEquals(0, this.library.countBooks());
        assertEquals(1, this.borrower.getBookCount());
    }

}
