package ChainOfResponsability;

import java.util.HashMap;

import ChainOfResponsability.Context.Input;
import ChainOfResponsability.Context.Output;
import ChainOfResponsability.Handler.DateVerifier;
import ChainOfResponsability.Handler.DigitVerifier;
import ChainOfResponsability.Handler.EmailVerifier;
import ChainOfResponsability.Handler.ISanitizer;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, String> inputs = new HashMap<>();
        inputs.put("email", "example@gmail.com");
        inputs.put("digit", "123456");
        inputs.put("date", "2021-01-01");

        Input fields = new Input(inputs);

        ISanitizer emailVerifier = new EmailVerifier(inputs.get("email"));
        ISanitizer digitVerifier = new DigitVerifier(inputs.get("digit"));
        ISanitizer dateVerifier = new DateVerifier(inputs.get("date"));

        emailVerifier.setNext(digitVerifier);
        digitVerifier.setNext(dateVerifier);

        Output output = emailVerifier.validate(fields);

        System.out.println(output.getEmail());
        System.out.println(output.getDigit());
        System.out.println(output.getDate());

    }
}
