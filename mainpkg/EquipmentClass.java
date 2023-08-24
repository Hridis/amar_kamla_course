
package mainpkg;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class EquipmentClass implements Serializable {
    private String equipmentName;
    private int  equipmentQuantity;

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public int getEquipmentQuantity() {
        return equipmentQuantity;
    }

    public void setEquipmentQuantity(int equipmentQuantity) {
        this.equipmentQuantity = equipmentQuantity;
    }

    @Override
    public String toString() {
        return "EquipmentClass{" + "equipmentName=" + equipmentName + ", equipmentQuantity=" + equipmentQuantity + '}';
    }

    public EquipmentClass(String equipmentName, int equipmentQuantity) {
        this.equipmentName = equipmentName;
        this.equipmentQuantity = equipmentQuantity;
    }
    
}
