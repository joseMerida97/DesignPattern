package ChainOfResponsability.Handler;

import ChainOfResponsability.Context.Input;
import ChainOfResponsability.Context.Output;

public interface ISanitizer {
    Output validate(Input request);

    void setNext(ISanitizer sanitizer);
}
