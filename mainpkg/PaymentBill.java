
package mainpkg;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author User
 */
public class PaymentBill implements Serializable{
    
    private String UserName;
    private int id;
    private String PackageNameDetails;
    //private int Packageprice;
    private LocalDate PaymentDate;
    private int amount;
    private String paymentMonth;
   
    public static String status = "Requested for Manual Payment";
    private String areaName;
    private String individualStatus = "Unpaid";
   
    

  

   public void updateStatusToPaid() {
    individualStatus = "Paid";
}

    public PaymentBill(String UserName, int id, String PackageNameDetails, LocalDate PaymentDate, int amount, String paymentMonth, String status, String areaName) {
     this.UserName = UserName;
        this.id = id;
        this.PackageNameDetails = PackageNameDetails;
        this.PaymentDate = PaymentDate;
        this.amount = amount;
        this.paymentMonth = paymentMonth;
        this.status = status;
        this.areaName = areaName;
        //this. individualStatus=individualStatus;
      
       
    }

    public String getIndividualStatus() {
        return individualStatus;
    }

    public void setIndividualStatus(String individualStatus) {
        this.individualStatus = individualStatus;
    }

    public String getAreaName() {
        return areaName;
    }

   

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public PaymentBill(String areaName) {
        this.areaName = areaName;
    }

    public String getStatus() {
        return "Requested for manual payment";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPackageNameDetails() {
        return PackageNameDetails;
    }

    public void setPackageNameDetails(String PackageNameDetails) {
        this.PackageNameDetails = PackageNameDetails;
    }

    public LocalDate getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(LocalDate PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPaymentMonth() {
        return paymentMonth;
    }

    public void setPaymentMonth(String paymentMonth) {
        this.paymentMonth = paymentMonth;
    }

    @Override
    public String toString() {
        return "paymentBill{" + "UserName=" + UserName + ", id=" + id + ", PackageNameDetails=" + PackageNameDetails + ", PaymentDate=" + PaymentDate + ", amount=" + amount + ", paymentMonth=" + paymentMonth + ", areaName=" + areaName + '}';
    }


   

  
    







}
