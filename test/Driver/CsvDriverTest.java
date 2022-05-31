/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CsvDriverTest {
    
    
   @Test
    public void testReadNotNull() {
        System.out.println("Read Test");
        String filename = "Example";
        CsvDriver instance = new CsvDriver();
        instance.read(filename);
        assertNotNull(instance);
    }

    /**
     * Test of write method, of class XmlDriver.
     */
    @Test
    public void testWriteNotEmpty() {
        System.out.println("write");
        String filename = "ExampleName";
        String content = "Any content";
        CsvDriver instance = new CsvDriver();
        instance.write(filename, content);
        assertTrue("Filename required",!filename.isEmpty());
        assertTrue("Not allow to write a empty content",!content.isEmpty());

    }
    
}
