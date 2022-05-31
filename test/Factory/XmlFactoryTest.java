/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Driver.IFilesDriver;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOSE MERIDA ROCA
 */
public class XmlFactoryTest {
    
   
    @Test
    public void testCreateFilesDrive() {
        System.out.println("createFilesDrive");
        IFactory instance = new XmlFactory();
        IFilesDriver result = instance.createFilesDrive();
        assertNotNull( result);


    }
    
}
