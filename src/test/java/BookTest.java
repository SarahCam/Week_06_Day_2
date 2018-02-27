import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("The Loney");
    }

    @Test
    public void canGetName(){
        assertEquals("The Loney", book.getName());
    }

}
