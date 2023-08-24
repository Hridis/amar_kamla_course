
package mainpkg;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Package implements Serializable {
   
    private String PackageName;
    private String ipVersion;
    private String speed;
    private int price;

    @Override
    public String toString() {
        return "Package{" + "PackageName=" + PackageName + ", ipVersion=" + ipVersion + ", speed=" + speed + ", price=" + price + '}';
    }

    public String getPackageName() {
        return PackageName;
    }

    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    public String getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Package(String PackageName, String ipVersion, String speed, int price) {
        this.PackageName = PackageName;
        this.ipVersion = ipVersion;
        this.speed = speed;
        this.price = price;
    }
    
    
    
    
    
}
