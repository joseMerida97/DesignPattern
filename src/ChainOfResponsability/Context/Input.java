package ChainOfResponsability.Context;

import java.util.HashMap;

public class Input {
    HashMap<String, String> inputs = new HashMap<>();

    public Input(HashMap<String, String> inputs) {
        this.inputs = inputs;
    }

    public HashMap<String, String> getInputs() {
        return inputs;
    }

    public void replaceInput(String replace, String value) {
        inputs.replace(replace, value);
    }

}
