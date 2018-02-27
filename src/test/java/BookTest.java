import org.junit.Before;
import org.junit.Test;
import sun.rmi.rmic.iiop.ValueType;

import javax.smartcardio.Card;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("The Loney", GenreType.HORROR);
    }

    @Test
    public void canGetName(){
        assertEquals("The Loney", book.getName());
    }

    @Test
    public void canGetGenre(){
        assertEquals(GenreType.HORROR, book.getGenre());
    }

    @Test
    public void horrorHasDescription(){
        book = new Book("The Exorcist", GenreType.HORROR);
        assertEquals("Very scary", book.getValueFromEnum());
    }

}
