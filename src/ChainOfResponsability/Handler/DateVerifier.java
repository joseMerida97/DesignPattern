package ChainOfResponsability.Handler;

import ChainOfResponsability.Context.Input;
import ChainOfResponsability.Context.Output;

public class DateVerifier extends ValidateHandler {
    private String date;

    public DateVerifier(String date) {
        this.date = date;
    }

    @Override
    public Output validate(Input request) {

        if (!this.date.matches("^((19|20)\\d\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$")) {
            request.replaceInput("date", "1999-01-01");
        }
        return super.validate(request);
    }

}
