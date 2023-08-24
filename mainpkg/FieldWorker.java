
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;



public class FieldWorker extends user{
    private ArrayList<EquipmentClass> selectedEquipment;
     public FieldWorker() {
        selectedEquipment = new ArrayList<>(); 
    }
    public boolean addEquipment(String equipmentname,int quantity){
        selectedEquipment.add(new EquipmentClass(equipmentname,quantity));
        return true;
        
    }
    public ArrayList<EquipmentClass> getSelectedEquipment(){
        return selectedEquipment;
    }
    
    public static ObservableList<CustomerCountAreaWiseClass>viewAreawiseCustomerCount(String month) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObservableList<CustomerCountAreaWiseClass> templist 
                = FXCollections.observableArrayList();
               
        
                int KhilgaonC = 0;
                int BashaboC = 0;
                int MugdaC = 0;
                int BanashreeC = 0;
                int RampuraC = 0;
                ObjectInputStream ois = null;
                PaymentBill tempbill = null;
       
        try{
           
                        if (month.equals("January")){
                                
                               
                                ois = new  ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin"));
                            while (true){
                            tempbill = (PaymentBill)ois.readObject();
                                if (tempbill.getAreaName().equals("Khilgaon")&& tempbill.getPaymentMonth().equals("January")){
                                    KhilgaonC++;
                            
                        }
                                if (tempbill.getAreaName().equals("Bashabo")&& tempbill.getPaymentMonth().equals("January")){
                                    BashaboC++;

                                }
                                if (tempbill.getAreaName().equals("Mugda")&& tempbill.getPaymentMonth().equals("January")){
                                    MugdaC++;

                                }
                                if (tempbill.getAreaName().equals("Banashree")&& tempbill.getPaymentMonth().equals("January")){
                                    BanashreeC++;

                                }
                                if (tempbill.getAreaName().equals("Rampura")&& tempbill.getPaymentMonth().equals("January")){
                                    RampuraC ++;

                                }
                            }
                        }
                        else if (month.equals("February")){
                               
                                ois = new  ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin"));
                            while (true){
                            tempbill = (PaymentBill)ois.readObject();
                                if (tempbill.getAreaName().equals("Khilgaon")&& tempbill.getPaymentMonth().equals("February")){
                                KhilgaonC++;
                            
                        }
                                if (tempbill.getAreaName().equals("Bashabo")&& tempbill.getPaymentMonth().equals("February")){
                                    BashaboC++;

                                }
                                if (tempbill.getAreaName().equals("Mugda")&& tempbill.getPaymentMonth().equals("February")){
                                    MugdaC++;

                                }
                                if (tempbill.getAreaName().equals("Banashree")&& tempbill.getPaymentMonth().equals("February")){
                                    BanashreeC++;

                                }
                                if (tempbill.getAreaName().equals("Rampura")&& tempbill.getPaymentMonth().equals("February")){
                                    RampuraC ++;

                            
                            
                        }
                            }
                            
                        }
                        else if (month.equals("March")){
                                
                                ois = new  ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin"));
                            while (true){
                            tempbill = (PaymentBill)ois.readObject();
                                if (tempbill.getAreaName().equals("Khilgaon")&& tempbill.getPaymentMonth().equals("March")){
                                KhilgaonC++;
                            
                        }
                                else if (tempbill.getAreaName().equals("Bashabo")&& tempbill.getPaymentMonth().equals("March")){
                                    BashaboC++;

                                }
                                else if (tempbill.getAreaName().equals("Mugda")&& tempbill.getPaymentMonth().equals("March")){
                                    MugdaC++;

                                }
                                else if (tempbill.getAreaName().equals("Banashree")&& tempbill.getPaymentMonth().equals("March")){
                                    BanashreeC++;

                                }
                                else if (tempbill.getAreaName().equals("Rampura")&& tempbill.getPaymentMonth().equals("March")){
                                    RampuraC ++;

                        }
                            
                        }
                        }
                        else if (month.equals("April")){
                               
                                ois = new  ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin"));
                            while (true){
                            tempbill = (PaymentBill)ois.readObject();
                                if (tempbill.getAreaName().equals("Khilgaon")&& tempbill.getPaymentMonth().equals("April")){
                                KhilgaonC++;
                            
                        }
                                else if (tempbill.getAreaName().equals("Bashabo")&& tempbill.getPaymentMonth().equals("April")){
                                    BashaboC++;

                                }
                                else if (tempbill.getAreaName().equals("Mugda")&& tempbill.getPaymentMonth().equals("April")){
                                    MugdaC++;

                                }
                                else if (tempbill.getAreaName().equals("Banashree")&& tempbill.getPaymentMonth().equals("April")){
                                    BanashreeC++;

                                }
                                else if (tempbill.getAreaName().equals("Rampura")&& tempbill.getPaymentMonth().equals("April")){
                                    RampuraC ++;

                                }
                             
                         }
                        }
                        else if (month.equals("May")){
                             
                                ois = new  ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin"));
                            while (true){
                            tempbill = (PaymentBill)ois.readObject();
                                if (tempbill.getAreaName().equals("Khilgaon")&& tempbill.getPaymentMonth().equals("May")){
                                KhilgaonC++;
                            
                        }
                                else if (tempbill.getAreaName().equals("Bashabo")&& tempbill.getPaymentMonth().equals("May")){
                                    BashaboC++;

                                }
                                else if (tempbill.getAreaName().equals("Mugda")&& tempbill.getPaymentMonth().equals("May")){
                                    MugdaC++;

                                }
                                else if (tempbill.getAreaName().equals("Banashree")&& tempbill.getPaymentMonth().equals("May")){
                                    BanashreeC++;

                                }
                                else if (tempbill.getAreaName().equals("Rampura")&& tempbill.getPaymentMonth().equals("May")){
                                    RampuraC ++;

                                }
                              
                          }
                                }
                        else if (month.equals("June")){
                             
                                ois = new  ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin"));
                            while (true){
                            tempbill = (PaymentBill)ois.readObject();
                                if (tempbill.getAreaName().equals("Khilgaon")&& tempbill.getPaymentMonth().equals("June")){
                                KhilgaonC++;
                            
                        }
                                else if (tempbill.getAreaName().equals("Bashabo")&& tempbill.getPaymentMonth().equals("June")){
                                    BashaboC++;

                                }
                                else if (tempbill.getAreaName().equals("Mugda")&& tempbill.getPaymentMonth().equals("June")){
                                    MugdaC++;

                                }
                                else if (tempbill.getAreaName().equals("Banashree")&& tempbill.getPaymentMonth().equals("June")){
                                    BanashreeC++;

                                }
                                else if (tempbill.getAreaName().equals("Rampura")&& tempbill.getPaymentMonth().equals("June")){
                                    RampuraC ++;

                                }
                              
                          }
                                }
                        else if (month.equals("July")){
                             
                                ois = new  ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin"));
                            while (true){
                            tempbill = (PaymentBill)ois.readObject();
                                if (tempbill.getAreaName().equals("Khilgaon")&& tempbill.getPaymentMonth().equals("July")){
                                KhilgaonC++;
                            
                        }
                                else if (tempbill.getAreaName().equals("Bashabo")&& tempbill.getPaymentMonth().equals("July")){
                                    BashaboC++;

                                }
                                else if (tempbill.getAreaName().equals("Mugda")&& tempbill.getPaymentMonth().equals("July")){
                                    MugdaC++;

                                }
                                else if (tempbill.getAreaName().equals("Banashree")&& tempbill.getPaymentMonth().equals("July")){
                                    BanashreeC++;

                                }
                                else if (tempbill.getAreaName().equals("Rampura")&& tempbill.getPaymentMonth().equals("July")){
                                    RampuraC ++;

                                }
                              
                          }
                                }
                        else if (month.equals("August")){
                             
                                ois = new  ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin"));
                            while (true){
                            tempbill = (PaymentBill)ois.readObject();
                                if (tempbill.getAreaName().equals("Khilgaon")&& tempbill.getPaymentMonth().equals("August")){
                                KhilgaonC++;
                            
                        }
                                else if (tempbill.getAreaName().equals("Bashabo")&& tempbill.getPaymentMonth().equals("August")){
                                    BashaboC++;

                                }
                                else if (tempbill.getAreaName().equals("Mugda")&& tempbill.getPaymentMonth().equals("August")){
                                    MugdaC++;

                                }
                                else if (tempbill.getAreaName().equals("Banashree")&& tempbill.getPaymentMonth().equals("August")){
                                    BanashreeC++;

                                }
                                else if (tempbill.getAreaName().equals("Rampura")&& tempbill.getPaymentMonth().equals("August")){
                                    RampuraC ++;

                                }
                              
                          }
                                }
                        else if (month.equals("September")){
                             
                                ois = new  ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin"));
                            while (true){
                            tempbill = (PaymentBill)ois.readObject();
                                if (tempbill.getAreaName().equals("Khilgaon")&& tempbill.getPaymentMonth().equals("September")){
                                KhilgaonC++;
                            
                        }
                                else if (tempbill.getAreaName().equals("Bashabo")&& tempbill.getPaymentMonth().equals("September")){
                                    BashaboC++;

                                }
                                else if (tempbill.getAreaName().equals("Mugda")&& tempbill.getPaymentMonth().equals("September")){
                                    MugdaC++;

                                }
                                else if (tempbill.getAreaName().equals("Banashree")&& tempbill.getPaymentMonth().equals("September")){
                                    BanashreeC++;

                                }
                                else if (tempbill.getAreaName().equals("Rampura")&& tempbill.getPaymentMonth().equals("September")){
                                    RampuraC ++;

                                }
                              
                          }
                                }
                        else if (month.equals("October")){
                             
                                ois = new  ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin"));
                            while (true){
                            tempbill = (PaymentBill)ois.readObject();
                                if (tempbill.getAreaName().equals("Khilgaon")&& tempbill.getPaymentMonth().equals("October")){
                                KhilgaonC++;
                            
                        }
                                else if (tempbill.getAreaName().equals("Bashabo")&& tempbill.getPaymentMonth().equals("October")){
                                    BashaboC++;

                                }
                                else if (tempbill.getAreaName().equals("Mugda")&& tempbill.getPaymentMonth().equals("October")){
                                    MugdaC++;

                                }
                                else if (tempbill.getAreaName().equals("Banashree")&& tempbill.getPaymentMonth().equals("October")){
                                    BanashreeC++;

                                }
                                else if (tempbill.getAreaName().equals("Rampura")&& tempbill.getPaymentMonth().equals("October")){
                                    RampuraC ++;

                                }
                              
                          }
                                }
                        else if (month.equals("November")){
                             
                                ois = new  ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin"));
                            while (true){
                            tempbill = (PaymentBill)ois.readObject();
                                if (tempbill.getAreaName().equals("Khilgaon")&& tempbill.getPaymentMonth().equals("November")){
                                KhilgaonC++;
                            
                        }
                                else if (tempbill.getAreaName().equals("Bashabo")&& tempbill.getPaymentMonth().equals("November")){
                                    BashaboC++;

                                }
                                else if (tempbill.getAreaName().equals("Mugda")&& tempbill.getPaymentMonth().equals("November")){
                                    MugdaC++;

                                }
                                else if (tempbill.getAreaName().equals("Banashree")&& tempbill.getPaymentMonth().equals("November")){
                                    BanashreeC++;

                                }
                                else if (tempbill.getAreaName().equals("Rampura")&& tempbill.getPaymentMonth().equals("November")){
                                    RampuraC ++;

                                }
                              
                          }
                                }
                        else if (month.equals("December")){
                             
                                ois = new  ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin"));
                            while (true){
                            tempbill = (PaymentBill)ois.readObject();
                                if (tempbill.getAreaName().equals("Khilgaon")&& tempbill.getPaymentMonth().equals("December")){
                                KhilgaonC++;
                            
                        }
                                else if (tempbill.getAreaName().equals("Bashabo")&& tempbill.getPaymentMonth().equals("December")){
                                    BashaboC++;

                                }
                                else if (tempbill.getAreaName().equals("Mugda")&& tempbill.getPaymentMonth().equals("December")){
                                    MugdaC++;

                                }
                                else if (tempbill.getAreaName().equals("Banashree")&& tempbill.getPaymentMonth().equals("December")){
                                    BanashreeC++;

                                }
                                else if (tempbill.getAreaName().equals("Rampura")&& tempbill.getPaymentMonth().equals("December")){
                                    RampuraC ++;

                                }
                              
                          }
                                }
        }
                        
           catch (Exception ex) {
            if (ois != null)
                ois.close();
            System.out.println(ex);
    
    
            }
               
                templist.add(
                        new CustomerCountAreaWiseClass
                        (KhilgaonC,"Khilgaon")
            );
            
                templist.add(
                        new CustomerCountAreaWiseClass
                        ( BashaboC,"Bashabo")
            );
            
                templist.add(
                        new CustomerCountAreaWiseClass
                        ( MugdaC,"Mugda")
            );
            
                templist.add(
                        new CustomerCountAreaWiseClass
                        ( BanashreeC,"Banashree")
            );
                templist.add(
                        new CustomerCountAreaWiseClass
                        ( RampuraC,"Rampura")
            );
            
        return templist;
}
        public static ObservableList<PaymentBill>viewAreawiseCustomerpaymentRecord(String area) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObservableList<PaymentBill> templist 
                = FXCollections.observableArrayList();
        ObjectInputStream ois = null;
        PaymentBill tempbill;
        boolean foundRecords = false;
        try{
           
            ois = new ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin")
                        );
            while(true){

                tempbill = (PaymentBill)ois.readObject();
                if (area != null){
                    if (tempbill.getAreaName().equals(area)) {
                        System.out.println(tempbill.toString());
                        templist.add(tempbill);
                        foundRecords = true;
                

                }
                }
                else{
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setContentText("No payment history of customers are available for this Area.");
                    a.showAndWait();
                       
        
        }
            }
        }
        catch (IOException ex) {
            System.out.println(ex);
           
        } finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) {
                //System.out.println(ex);
            }
        }
        if (!foundRecords) {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText("No payment history of customers are available for this Area.");
        a.showAndWait();
    }
        return templist;
            
         
        
    }
    public static ObservableList<PaymentBill>updateCustomerpaymentRecord(String username) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObservableList<PaymentBill> templist 
                = FXCollections.observableArrayList();
        ObjectInputStream ois = null;
        PaymentBill tempbill;
        boolean foundRecords = false;
        try{
           
            ois = new ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin")
                        );
            while(true){

                tempbill = (PaymentBill)ois.readObject();
                if (username != null){
                    if (tempbill.getUserName().equals(username)) {
                        System.out.println(tempbill.toString());
                        templist.add(tempbill);
                        foundRecords = true;
                

                }
                }
                else{
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setContentText("No payment history is available of this customer username.");
                    a.showAndWait();
                       
        
        }
            }
        }
        catch (IOException ex) {
            System.out.println(ex);
           
        } finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) {
                //System.out.println(ex);
            }
        }
        
    
        return templist;
            
         
        
    }
}

 
