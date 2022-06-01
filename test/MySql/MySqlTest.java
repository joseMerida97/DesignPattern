
package MySql;

import Classes.Home;
import Classes.UserInformation;
import org.junit.Test;
import static org.junit.Assert.*;

public class MySqlTest {

    public MySqlTest() {
    }

    @Test
    public void testSave() {
        System.out.println("save");
        Home userHome = new Home("Apartment", "Los cusis avenue");
        UserInformation UserInformation = new UserInformation("Jose", "Merida", userHome);
        MySql instance = new MySql();
        String result = instance.save(UserInformation);
        System.out.println(result);
        assertTrue(!result.isEmpty());
    }

}
