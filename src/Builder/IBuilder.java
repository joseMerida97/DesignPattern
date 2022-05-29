package Builder;

import Parts.ControlPanel;
import Parts.Engine;

public interface IBuilder {
    void setEngine(Engine engine);
    void setPassengers(int passengers);
    void setControlPanel(ControlPanel controlPanel);
 
}
