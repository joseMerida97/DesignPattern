
package observer;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserSuscriberTest {
    
    public UserSuscriberTest() {
    }

    @Test
    public void testRegister() {
        System.out.println("register");
        User user = new User("Jose", "example@gmail.com", "https://www.pinterest.es/pin/12/", "60019665");
        UserSuscriber instance = new UserSuscriber(EventName.REGISTER);
        instance.register(user);
        assertNotNull(instance);
    }
    
}
