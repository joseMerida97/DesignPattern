package Products;

import Parts.ControlPanel;
import Parts.Engine;

public class SpaceStation {

    private Engine engine;
    private int passengers;
    private ControlPanel controlPanel;
    private double fuel=0;

    
    public SpaceStation(Engine engine, int passengers, ControlPanel controlPanel) {
        this.engine = engine;
        this.passengers = passengers;
        this.controlPanel = controlPanel;
    }


    public Engine getEngine() {
        return engine;
    }


    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public int getPassengers() {
        return passengers;
    }


    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }


    public ControlPanel getContolPanel() {
        return controlPanel;
    }


    public void setContolPanel(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }


    public double getFuel() {
        return fuel;
    }


    public void setFuel(double fuel) {
        this.fuel = fuel;
    }



    
    
}
