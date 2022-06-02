
package ChainOfResponsability.Handler;

import ChainOfResponsability.Context.Input;
import ChainOfResponsability.Context.Output;
import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;


public class EmailVerifierTest {
    
    public EmailVerifierTest() {
    }

    @Test
    public void testValidate() {
        System.out.println("validate");
        HashMap<String,String> fields=new HashMap<>();
        Input request = new Input(fields);
        EmailVerifier instance = new EmailVerifier("example@gmail.com");
        Output result = instance.validate(request);
        assertNotNull(result);
    }
    
}
