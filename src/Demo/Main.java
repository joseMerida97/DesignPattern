/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import Factory.UserFilesParser;

/**
 *
 * @author JOSE MERIDA ROCA
 */
public class Main {
    
     public static void main(String[] args){
         UserFilesParser parser=new UserFilesParser();
         parser.createDriver("csv", "Test", "FirstName: Jose\n LastName: Merida");
         parser.getUsers("Jose");

    }
    
    
   
    
}
