
package mainpkg;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;





public class Customer extends user {
    protected String AddressDetails;
    protected String PackageDetails;
    
    
    public  static ObservableList<PieChart.Data>viewPopularPackageChart(){
        //local observablelist
        ObservableList<PieChart.Data> pieDataSet
                = FXCollections.observableArrayList();
        
        int SilverC = 0;
        int PremiumC = 0;
        int GamerC = 0;
        int ProntoC = 0;
        int primoC = 0;
        int PressoC = 0;
        
        ObjectInputStream ois = null;
        PaymentBill tempPackage = null;
        try{
        
            ois = new ObjectInputStream(
            new FileInputStream("CustomerPaymentBill.bin")
            );
            while(true){
                tempPackage = (PaymentBill)ois.readObject();
                if (tempPackage.getPackageNameDetails().equals("Silver (12Mbps) 900Tk"))
                    SilverC++;
                else if (tempPackage.getPackageNameDetails().equals("Premium (15Mbps) 1110Tk"))
                    PremiumC++;
                else if (tempPackage.getPackageNameDetails().equals("Gamer (20Mbps) 1300Tk"))
                    GamerC ++;
                else if (tempPackage.getPackageNameDetails().equals("Pronto(30Mbps) 1500 Tk"))
                    ProntoC++;
                else if (tempPackage.getPackageNameDetails().equals("Primo (40Mbps) 2000 Tk"))
                    primoC++;
                else if (tempPackage.getPackageNameDetails().equals("Presso (50Mbps) 2500 Tk"))
                    PressoC++;             
            }
       
        }
        
        catch(Exception e){
            if (ois != null)
                try {
                    ois.close();
              } catch(IOException ex){
        }
            
    }
        finally{
            pieDataSet.add(
            new PieChart.Data("Silver Package", SilverC));
            
            pieDataSet.add(
            new PieChart.Data("Premium Package ", PremiumC ));
            
            pieDataSet.add(
            new PieChart.Data("Gamer Package", GamerC));
            
            pieDataSet.add(
            new PieChart.Data("Presso Package", PressoC ));
            
            pieDataSet.add(
            new PieChart.Data("Pronto  Package", ProntoC ));
            
            pieDataSet.add(
            new PieChart.Data("Primo Package", primoC ));
            return pieDataSet;
        }
    }
    public static ObservableList<PieChart.Data>viewfeedback(){
         //local observablelist
        ObservableList<PieChart.Data> pieDataSet
                = FXCollections.observableArrayList();
        int goodC = 0;
        int badC = 0;
        int bestC = 0;
        int averageC = 0;
        int satisfactoryC = 0;
        int impC = 0;
        
        
            
        
        ObjectInputStream ois = null;
        FeedbackOfCustomerClass tempfeed = null;
        try{
        
            ois = new ObjectInputStream(
            new FileInputStream("CustomerFeedback.bin")
            );
            while(true){
                tempfeed = (FeedbackOfCustomerClass)ois.readObject();
                if (tempfeed.getFeedback().equals("Good"))
                    goodC++;
                else if (tempfeed.getFeedback().equals("Best"))
                    bestC++;
                else if (tempfeed.getFeedback().equals("Average"))
                    averageC ++;
                else if (tempfeed.getFeedback().equals("Satisfactory"))
                    satisfactoryC++;
                else if (tempfeed.getFeedback().equals("Bad"))
                    badC++;
                else if (tempfeed.getFeedback().equals("Need more Improvement"))
                    impC ++;             
            }
       
        }
        
        catch(Exception e){
            if (ois != null)
                try {
                    ois.close();
              } catch(IOException ex){
        }
            
    }
    
        finally{
            pieDataSet.add(
            new PieChart.Data("Good", goodC));
            
            pieDataSet.add(
            new PieChart.Data("Best", bestC ));
            pieDataSet.add(
            new PieChart.Data("Average", averageC ));
            
            pieDataSet.add(
            new PieChart.Data("Satisfactory",satisfactoryC ));
            
            pieDataSet.add(
            new PieChart.Data("Bad", badC ));
            
            pieDataSet.add(
            new PieChart.Data("Need more Improvement", impC ));
            return pieDataSet;
        }
    }
    
    
    

    public static boolean payOnline(String UserName, int id, String PackageNameDetails, LocalDate PaymentDate, int amount, String paymentMonth,String status, String areaName) {
        PaymentBill newBill = new PaymentBill(UserName, id, PackageNameDetails, PaymentDate, amount, paymentMonth, status, areaName);
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        try {
            f = new File("CustomerPaymentBill.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            oos.writeObject(newBill );
            
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
    
    public static boolean giveFeedback (String feedback,int feedbackValue){
        FeedbackOfCustomerClass newFeedback = new FeedbackOfCustomerClass(  
                    feedback,
                    feedbackValue
                  
        );
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("CustomerFeedback.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            oos.writeObject(newFeedback) ;
            
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
    public static boolean givecomplain (String username,String complainType, String additionalComplain){
        ComplainClass newComplain = new ComplainClass(  
                    username, complainType, additionalComplain
                
                  
        );
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("CustomerComplains.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            oos.writeObject(newComplain ) ;
            
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
    public static boolean addPackage (String packagename,String ipVersion,  String  speed,int price) throws ClassNotFoundException{
        Package newpackage = new Package ( packagename, ipVersion,speed,price           
        );
     
        ObjectInputStream ois = null;
        Package  tempPackage = null;
        try{
        
            ois = new ObjectInputStream(
            new FileInputStream("Package.bin")
            );
            while(true){
                tempPackage = (Package)ois.readObject();
        
            }
        }
           
         catch (IOException ex) {
            if(ois!=null) try {
                ois.close();
            } catch (IOException ex1) {
                Logger.getLogger(invisibleWorker.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        }   
    }
    public static ObservableList<Package>viewPackage() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObservableList<Package> templist
                = FXCollections.observableArrayList();
        ObjectInputStream ois = null;
        Package tempPackage;
       
        try{
           
            ois = new ObjectInputStream(new FileInputStream("Package.bin")
                        );
            while(true){

                tempPackage = (Package)ois.readObject();
             
                        System.out.println(tempPackage.toString());
                       templist.add(tempPackage);
                }
            } catch (EOFException eof) {
                    // Exit the loop when end of file is reached
            }
        
     catch (IOException ex) {
        System.out.println(ex);
    } 
    finally {
        if (ois != null) {
            ois.close();
        }
    }
    return templist;
    }
}




 