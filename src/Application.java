import Builder.SpaceStationBuilder;
import Director.Director;
import Products.SpaceStation;

public class Application {

    public static void main(String[] args) {
       SpaceStationBuilder spaceStationBuilder=new SpaceStationBuilder(); 
       Director director=new Director(spaceStationBuilder);
       director.constructSpaceStation();
       SpaceStation spaceStation= spaceStationBuilder.getSpaceStation(); 

       System.out.println("SpaceStation created with Engine cc: "+ spaceStation.getEngine().getVolume());
       System.out.println("SpaceStation created with Engine mileage: "+ spaceStation.getEngine().getMileage());
       System.out.println("SpaceStation created with passengers: "+ spaceStation.getPassengers());
       System.out.println("end of example");


    }
    
}
