package Factory;

import Driver.IFilesDriver;
import Driver.XmlDriver;

public class XmlFactory implements IFactory {

    @Override
    public IFilesDriver createFilesDrive() {
        return new XmlDriver();
    }
    
}
