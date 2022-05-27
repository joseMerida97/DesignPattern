package AbstractFactory;

import AbstractFactory.Application.Application;
import AbstractFactory.Factory.ElfoFactory;
import AbstractFactory.Factory.IAbstractFactory;

public class Demo {
    public static void main(String[] args) {
        IAbstractFactory abstractFactory = new ElfoFactory();
        Application application = new Application(abstractFactory);

        application.create();
}


}