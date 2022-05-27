package AbstractFactory.Factory;

import AbstractFactory.IHouse;
import AbstractFactory.IRace;
import AbstractFactory.OrcoCity;
import AbstractFactory.OrcoRace;

public class OrcoFactory implements IAbstractFactory{

    @Override
    public IRace createRace() {
        return new OrcoRace();
    }

    @Override
    public IHouse createCity() {
        return new OrcoCity();
    }
    
}
