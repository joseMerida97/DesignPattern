package Builder;

import Parts.ControlPanel;
import Parts.Engine;
import Products.SpaceStation;

public class SpaceStationBuilder implements IBuilder{
    private int passengers;
    private Engine engine;
    private ControlPanel controlPanel;


    @Override
    public void setEngine(Engine engine) {
        this.engine=engine;
        
    }
    @Override
    public void setPassengers(int passengers) {
        this.passengers=passengers;
        
    }
    @Override
    public void setControlPanel(ControlPanel controlPanel) {
       this.controlPanel=controlPanel;
        
    }

    public SpaceStation getSpaceStation(){
        return new SpaceStation(this.engine, this.passengers, this.controlPanel);
    }
}
