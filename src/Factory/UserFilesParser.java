/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;


/**
 *
 * @author JOSE MERIDA ROCA
 */
public class UserFilesParser {

    protected IFactory driverFactory ;
   

    public UserFilesParser(IFactory driveFactory) {
        this.driverFactory=driveFactory;
    }

    
    
    

    public void getUsers(String filename) {
       
        this.driverFactory.createFilesDrive().write(filename, "Any content");
        this.driverFactory.createFilesDrive().read(filename);
        
    }

}
