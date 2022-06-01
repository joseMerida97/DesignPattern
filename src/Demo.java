
import Application.Application;
import Factory.ElfoFactory;
import Factory.IAbstractFactory;

public class Demo {
    public static void main(String[] args) {
        IAbstractFactory abstractFactory = new ElfoFactory();
        Application application = new Application(abstractFactory);

        application.create();
    }

}