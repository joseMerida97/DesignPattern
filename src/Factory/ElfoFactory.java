package Factory;

import Product.ElfoCity;
import Product.ElfoRace;
import Product.ICity;
import Product.IHouse;
import Product.IRace;
import Product.TowerHouse;

public class ElfoFactory implements IAbstractFactory {

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
