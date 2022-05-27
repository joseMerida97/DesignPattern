package AbstractFactory;

public class OrcoRace implements IRace {

    @Override
    public void populate() {
        System.out.println("Creating ElfoRace");

        
    }

    @Override
    public void fight() {
  System.out.println("Fight well!");        
    }

    @Override
    public void planStrategies() {
        System.out.println("Rude!");
    }

    @Override
    public void work() {
        System.out.println("Work hard");
    }
    
}
