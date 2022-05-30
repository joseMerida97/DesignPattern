/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

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
public class LogsTest {
 
    @Test
    public void testGetInstance() {
        
        System.out.println("getInstance");
        Logs result = Logs.getInstance();
        assertNotNull(result);
        
    }

   
    
}
