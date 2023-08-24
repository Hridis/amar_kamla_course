
package mainpkg;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class ComplainClass implements Serializable {
    private String username;
    private String complainType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComplainType() {
        return complainType;
    }

    public void setComplainType(String complainType) {
        this.complainType = complainType;
    }

    public String getAdditionalComplain() {
        return additionalComplain;
    }

    public void setAdditionalComplain(String additionalComplain) {
        this.additionalComplain = additionalComplain;
    }

    public ComplainClass(String username, String complainType, String additionalComplain) {
        this.username = username;
        this.complainType = complainType;
        this.additionalComplain = additionalComplain;
    }

    @Override
    public String toString() {
        return "ComplainClass{" + "username=" + username + ", complainType=" + complainType + ", additionalComplain=" + additionalComplain + '}';
    }
    private String additionalComplain;
    
    
}
