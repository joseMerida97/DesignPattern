package AbstractFactory.Factory;

import AbstractFactory.IHouse;
import AbstractFactory.IRace;

public interface  IAbstractFactory {
   IRace createRace();
   IHouse createCity();

}
