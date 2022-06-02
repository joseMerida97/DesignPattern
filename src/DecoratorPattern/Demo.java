package DecoratorPattern;

import DecoratorPattern.Decorators.DarkModePrint;
import DecoratorPattern.Decorators.LightModePrint;

public class Demo {
    public static void main(String[] args) {
        NormalModePrint normalMode = new NormalModePrint();
        DarkModePrint darkMode = new DarkModePrint(normalMode);
        LightModePrint lightMode = new LightModePrint(darkMode);

        Application application = new Application(lightMode);
        application.ShowNames();

    }
}
