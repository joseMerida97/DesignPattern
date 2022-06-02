package DecoratorPattern;

public class Application {
    IPrint print;

    public Application(IPrint print) {
        this.print = print;
    }

    public void ShowNames(){
        this.print.print("JDoe");
    }
}
