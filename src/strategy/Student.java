package strategy;

public class Student implements ISale {

    @Override
    public Boolean sell(double amount) {
        double discount = (0.25 * amount);
        System.out.println("Discount of 25% applied" + (amount - discount) + "$");
        return true;
    }
}
