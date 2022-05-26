/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Products.IFilesDriver;

/**
 *
 * @author JOSE MERIDA ROCA
 */
public class UserFilesParser {

    protected DriverFactory driverFactory = new DriverFactory();
    protected IFilesDriver filesDriver;

    public void createDriver(String type, String filename, String content) {
        if (type.equals("csv")) {
            filesDriver = driverFactory.getDriver(driverFactory.csvFile);
            filesDriver.write(filename, content);
        }

        if (type.equals("xml")) {
            filesDriver = driverFactory.getDriver(driverFactory.xmlFile);
            filesDriver.write(filename, content);
        }

    }

    public void getUsers(String filename) {
        filesDriver.read(filename);
    }

}
