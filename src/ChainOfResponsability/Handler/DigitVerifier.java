package ChainOfResponsability.Handler;

import ChainOfResponsability.Context.Input;
import ChainOfResponsability.Context.Output;

public class DigitVerifier extends ValidateHandler {
    private String digit;

    public DigitVerifier(String digit) {
        this.digit = digit;
    }

    @Override
    public Output validate(Input request) {

        if (!this.digit.matches("[0-9]*")) {
            request.replaceInput("digit", "0");
        }

        return super.validate(request);
    }

}
