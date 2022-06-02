package ChainOfResponsability.Handler;

import ChainOfResponsability.Context.Input;
import ChainOfResponsability.Context.Output;

public class ValidateHandler implements ISanitizer{

    private ISanitizer next;
    
    @Override
    public Output validate(Input request) {
        if(next != null){
            return next.validate(request);
        }
        
        String email=request.getInputs().get("email");
        String digit=request.getInputs().get("digit");
        String date=request.getInputs().get("date");

        return new Output(email, digit,date);
    }

    @Override
    public void setNext(ISanitizer sanitizer) {
        next = sanitizer;
    }
    
}
