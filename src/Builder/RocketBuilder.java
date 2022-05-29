package Builder;

import Parts.ControlPanel;
import Parts.Engine;
import Products.Rocket;

public class RocketBuilder implements IBuilder{
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

    public Rocket getRocket(){

        return new Rocket(this.engine, this.passengers, this.controlPanel);
    }
}
