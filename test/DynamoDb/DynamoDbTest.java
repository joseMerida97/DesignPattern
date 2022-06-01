
package DynamoDb;

import Classes.Home;
import org.junit.Test;
import static org.junit.Assert.*;

public class DynamoDbTest {

    public DynamoDbTest() {
    }

    @Test
    public void testSave() {
        System.out.println("save");
        Home home = new Home("Apartment", "Zona equipetrol");
        DynamoDb instance = new DynamoDb();
        String result = instance.save(home);
        System.out.println(result);
        assertNotNull(result);
    }

}
