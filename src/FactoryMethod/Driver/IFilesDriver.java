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
public interface IFilesDriver {
    void read(String filename);
    void write(String filename, String content);
    
}
