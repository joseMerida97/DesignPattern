package ChainOfResponsability.Handler;

import ChainOfResponsability.Context.Input;
import ChainOfResponsability.Context.Output;
import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

public class DigitVerifierTest {

    public DigitVerifierTest() {
    }

    @Test
    public void testValidate() {
        System.out.println("validate");
        HashMap<String,String>fields=new HashMap<>();
        fields.put("digit", "1234t56");
        Input request = new Input(fields);
        DigitVerifier instance = new DigitVerifier(fields.get("digit"));
        Output result = instance.validate(request);
        assertNotNull(result);
    }

}
