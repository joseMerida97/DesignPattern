package Application;

import Factory.IAbstractFactory;

public class Application {
    IAbstractFactory abstractFactory;

    public Application(IAbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void create(){
        abstractFactory.createRace().populate();
        abstractFactory.createCity().createCity();
        abstractFactory.createHouse().getHouse();
    }   
}
