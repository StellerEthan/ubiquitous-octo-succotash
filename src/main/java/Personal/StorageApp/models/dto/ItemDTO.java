package Personal.StorageApp.models.dto;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;

public class ItemDTO {

    private String itemName;

    private String itemDesc;

    private String itemLoc;

    @Temporal(TemporalType.DATE)
    private Calendar itemExp;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemLoc() {
        return itemLoc;
    }

    public void setItemLoc(String itemLoc) {
        this.itemLoc = itemLoc;
    }

    public Calendar getItemExp() {
        return itemExp;
    }

    public void setItemExp(Calendar itemExp) {
        this.itemExp = itemExp;
    }

}
