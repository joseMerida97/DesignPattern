/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Products;

/**
 *
 * @author JOSE MERIDA ROCA
 */
public class XmlDriver  implements IFilesDriver{

    @Override
    public void read(String filename) {
        System.out.println("Reading XML"+ filename+".xml . . .");
    }

    @Override
    public void write(String filename, String content) {
    System.out.println("Writing XML. . .\n "+"Filename: "+filename+"\n"+ "Content: "+content);

    }
    
}
