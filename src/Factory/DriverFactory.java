/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Driver.CsvDriver;
import Driver.IFilesDriver;
import Driver.XmlDriver;

/**
 *
 * @author JOSE MERIDA ROCA
 */
public  class DriverFactory {
    
    public int csvFile=1;
    public int xmlFile=2;
    
    public  IFilesDriver getDriver(int type){
        
        switch(type){
            case 1:
                return new CsvDriver();
            case 2:
                return new XmlDriver();    
            default:
             return new CsvDriver();
        }
        
    }
    
}
