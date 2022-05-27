package AbstractFactory.Factory;

import AbstractFactory.ElfoCity;
import AbstractFactory.ElfoRace;
import AbstractFactory.IHouse;
import AbstractFactory.IRace;

public class ElfoFactory implements IAbstractFactory{

    @Override
    public IRace createRace() {
        return new ElfoRace();
    }

    @Override
    public IHouse createCity() {
        return new ElfoCity();
    }
    
}
