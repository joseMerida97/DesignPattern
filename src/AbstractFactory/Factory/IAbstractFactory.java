package AbstractFactory.Factory;

import AbstractFactory.ICity;
import AbstractFactory.IHouse;
import AbstractFactory.IRace;

public interface  IAbstractFactory {
   IRace createRace();
   IHouse createHouse();
   ICity createCity();

}
