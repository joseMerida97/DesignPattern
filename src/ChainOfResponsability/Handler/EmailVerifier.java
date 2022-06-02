package ChainOfResponsability.Handler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ChainOfResponsability.Context.Input;
import ChainOfResponsability.Context.Output;

public class EmailVerifier extends ValidateHandler{

    private String email;

    public EmailVerifier(String email) {
        this.email = email;
    }

    @Override
    public Output validate(Input request) {
        String regx = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern=Pattern.compile(regx); 
        Matcher matcher = pattern.matcher(this.email);
        if(!matcher.matches()){
            request.replaceInput("email", "");
        }

        return super.validate(request);
    }
    
}
