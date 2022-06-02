package ChainOfResponsability.Handler;

import ChainOfResponsability.Context.Input;
import ChainOfResponsability.Context.Output;
import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

public class DateVerifierTest {
    
    public DateVerifierTest() {
    }

    @Test
    public void testValidate() {
        System.out.println("validate");
        HashMap<String,String> fields=new HashMap<>();
        fields.put("date", "2022-02-02");
        Input request = new Input(fields);
        DateVerifier instance = new DateVerifier(fields.get("date"));
        Output result = instance.validate(request);
        assertNotNull(result);
    }
    
}
