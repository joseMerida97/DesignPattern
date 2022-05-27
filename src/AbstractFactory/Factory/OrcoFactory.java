package AbstractFactory.Factory;

import AbstractFactory.CaveHouse;
import AbstractFactory.ICity;
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
    public IHouse createHouse() {
        return new CaveHouse();
    }

    @Override
    public ICity createCity() {
        return new OrcoCity();
    }

    
}
