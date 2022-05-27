/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod.Driver;

/**
 *
 * @author JOSE MERIDA ROCA
 */
public class CsvDriver implements IFilesDriver{

    @Override
    public void read(String filename) {
        System.out.println("Reading "+ filename+".csv . . .");
    }

    @Override
    public void write(String filename, String content) {
        System.out.println("Writing CSV. . .\n "+"Filename: "+filename+"\n"+ "Content: "+content);
    }
    
}
