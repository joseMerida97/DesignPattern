package strategy;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookstoreTest {
    
    public BookstoreTest() {
    }
    
    @Test
    public void testSetSale() {
        System.out.println("setSale");
        ISale sale = new Student();
        Bookstore instance = new Bookstore(sale);
        instance.setSale(sale);
        assertNotNull(instance);
    }
    
    @Test
    public void testSellBook() {
        System.out.println("sellBook");
        String bookName = "Math";
        double bookPrice = 15.0;
        ISale sale = new Student();
        Bookstore instance = new Bookstore(sale);
        instance.sellBook(bookName, bookPrice);
        assertNotNull(instance);
    }
    
}
