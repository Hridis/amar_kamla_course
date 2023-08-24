
package mainpkg;

/**
 *
 * @author User
 */
public class CustomerCountAreaWiseClass {
    private int customerCount;
    private String areaname;

    public CustomerCountAreaWiseClass() {
    }

    public CustomerCountAreaWiseClass(int customerCount, String areaname) {
        this.customerCount = customerCount;
        this.areaname = areaname;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    @Override
    public String toString() {
        return "CustomerCountAreaWiseClass{" + "customerCount=" + customerCount + ", areaname=" + areaname + '}';
    }
    
}
