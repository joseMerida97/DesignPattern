/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Driver.IFilesDriver;

/**
 *
 * @author JOSE MERIDA ROCA
 */
public class UserFilesParser {

    protected DriverFactory driverFactory = new DriverFactory();
    protected IFilesDriver filesDriver;
    protected String type;

    public UserFilesParser(String type) {
        this.type = type;
    }

    
    
    private void createDriver() {
        if (this.type.equals("csv")) {
            filesDriver = driverFactory.getDriver(driverFactory.csvFile);
            
        }

        if (this.type.equals("xml")) {
            filesDriver = driverFactory.getDriver(driverFactory.xmlFile);
        }

    }
    
    

    public void getUsers(String filename) {
        createDriver();
        filesDriver.write(filename, "Any content");
        filesDriver.read(filename);
        
    }

}
