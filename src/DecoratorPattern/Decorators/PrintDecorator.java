package DecoratorPattern.Decorators;

import DecoratorPattern.IPrint;

public class PrintDecorator implements IPrint {
    private IPrint wrappee;
    
    public PrintDecorator(IPrint wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void print(String username) {
        this.wrappee.print(username);
    }
    
}
