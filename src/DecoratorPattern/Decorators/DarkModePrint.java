package DecoratorPattern.Decorators;

import DecoratorPattern.IPrint;

public class DarkModePrint extends PrintDecorator{

    public DarkModePrint(IPrint wrappee) {
        super(wrappee);
    }

    @Override
    public void print(String username) {
        super.print(username);
        System.out.println("Dark Mode: "+"!!!"+username+"!!!"+"(╯°□°)╯︵ ┻━┻");
        
    }
    
    
}
