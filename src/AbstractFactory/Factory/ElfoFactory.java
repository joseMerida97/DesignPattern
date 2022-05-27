package AbstractFactory.Factory;

import AbstractFactory.ElfoCity;
import AbstractFactory.ElfoRace;
import AbstractFactory.ICity;
import AbstractFactory.IHouse;
import AbstractFactory.IRace;
import AbstractFactory.TowerHouse;

public class ElfoFactory implements IAbstractFactory{

    @Override
    public IRace createRace() {
        return new ElfoRace();
    }

    @Override
    public IHouse createHouse() {
        return new TowerHouse();
    }

    @Override
    public ICity createCity() {
        return new ElfoCity();
    }

   
    
}
