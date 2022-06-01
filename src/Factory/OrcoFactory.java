package Factory;

import Product.CaveHouse;
import Product.ICity;
import Product.IHouse;
import Product.IRace;
import Product.OrcoCity;
import Product.OrcoRace;

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
