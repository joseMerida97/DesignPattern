package Director;

import Builder.IBuilder;
import Parts.ControlPanel;
import Parts.Engine;

public class Director {
    IBuilder builder;

    public Director(IBuilder builder) {
        this.builder = builder;
    }

    public void constructRocket(){
        this.builder.setPassengers(3);
        this.builder.setEngine(new Engine(1.2, 0.0));
        this.builder.setControlPanel(ControlPanel.AUTOMATIC);

    }

    public void constructSpaceStation(){
        this.builder.setPassengers(25);
        this.builder.setEngine(new Engine(5.5, 0.0));
        this.builder.setControlPanel(ControlPanel.SINGLE_SPEED);

    }

    
    
}
