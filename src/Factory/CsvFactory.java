package Factory;

import Driver.CsvDriver;
import Driver.IFilesDriver;

public class CsvFactory implements IFactory{
    @Override
    public IFilesDriver createFilesDrive() {
        return new CsvDriver();
    } 
}

