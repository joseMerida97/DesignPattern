/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOSE MERIDA ROCA
 */
public class XmlDriverTest {
  
    @Test
    public void testReadNotNull() {
        System.out.println("Read Test");
        String filename = "Example";
        XmlDriver instance = new XmlDriver();
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
        XmlDriver instance = new XmlDriver();
        instance.write(filename, content);
        assertTrue("Filename required",!filename.isEmpty());
        assertTrue("Not allow to write a empty content",!content.isEmpty());

    }
    
}
