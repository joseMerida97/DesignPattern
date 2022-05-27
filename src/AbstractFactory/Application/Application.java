package AbstractFactory.Application;

import AbstractFactory.Factory.IAbstractFactory;

public class Application {
    IAbstractFactory abstractFactory;

    public Application(IAbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void create(){
        abstractFactory.createRace().populate();
        abstractFactory.createCity().getHouse();
    }   
}
