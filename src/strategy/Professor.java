package strategy;

public class Professor implements ISale{
    @Override
    public Boolean sell(double amount) {
        System.out.println("Sold out to professor " + amount);
        return true;
    }
}
