package DecoratorPattern.Decorators;

import DecoratorPattern.IPrint;

public class LightModePrint extends PrintDecorator {

    public LightModePrint(IPrint wrappee) {
        super(wrappee);
    }

    @Override
    public void print(String username) {
        super.print(username);
        System.out.println("Light Mode: "+"***"+username+"***"+"┬─┬ノ( º _ ºノ)");
    }
    
}
