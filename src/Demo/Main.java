/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import Factory.CsvFactory;
import Factory.IFactory;
import Factory.UserFilesParser;
import Factory.XmlFactory;


/**
 *
 * @author JOSE MERIDA ROCA
 */
public class Main {
    
     public static void main(String[] args){
         IFactory xmlDriver=new XmlFactory();
         UserFilesParser parser=new UserFilesParser(xmlDriver);
         parser.getUsers("Jose");

         System.out.println("#################");

         IFactory csvDriver=new CsvFactory();
         UserFilesParser parser2=new UserFilesParser(csvDriver);
         parser2.getUsers("Jose");
         
 
         

    }
    
    
   
    
}
