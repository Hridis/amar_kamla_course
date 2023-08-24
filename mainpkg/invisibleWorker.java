/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class invisibleWorker extends user implements Serializable{
  
    private String workingPlace;

    public static boolean addNewPackage(String PackageName, String ipVersion, String speed, int price){
        
        Package newPackage = new Package(
                PackageName, 
                ipVersion, 
                speed, 
                price
        );
        
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("Package.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            oos.writeObject(newPackage);
            
            oos.close();
            return true;
           
        } catch (IOException ex) {
            if(oos!=null) try {
                oos.close();
            } catch (IOException ex1) {
                Logger.getLogger(invisibleWorker.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        }  

      
        
    }
    
    
}
