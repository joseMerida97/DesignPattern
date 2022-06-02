package DecoratorPattern;

public class NormalModePrint implements IPrint {

    @Override
    public void print(String username) {
        System.out.println("Showing username: " + username);

    }

}
