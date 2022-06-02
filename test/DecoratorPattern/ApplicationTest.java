
package DecoratorPattern;

import DecoratorPattern.Decorators.DarkModePrint;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    
    public ApplicationTest() {
    }

    @Test
    public void testShowNames() {
        System.out.println("ShowNames");
        IPrint normalMode= new NormalModePrint();
        assertNotNull(normalMode);
        IPrint darkMode= new DarkModePrint(normalMode);
        Application instance = new Application(darkMode);
        instance.ShowNames();
    }
    
}
