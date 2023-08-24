
package mainpkg;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author User
 */
public class user implements Serializable{
    protected int id;
    protected String name;
    protected int contactNumber;
    protected LocalDate dob,doj;
/*
    public user(int id, String name, LocalDate dob, LocalDate doj) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
    }
*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "user{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", doj=" + doj + '}';
    }

    

    
    
    
    
}
