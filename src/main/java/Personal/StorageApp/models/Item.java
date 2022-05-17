package Personal.StorageApp.models;

import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Item extends AbstractEntity {

    @NotNull
    private String itemName;

    @NotNull
    private String itemDesc;

    @ManyToOne
    @NotNull
    private Location itemLoc;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Calendar itemExp;

    public Item(){};

    public Item(String name, String desc, Calendar itemExp){
        this.itemName = name;
        this.itemDesc = desc;
        this.itemExp = itemExp;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {return itemDesc;}

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public Location getItemLoc() {
        return itemLoc;
    }

    public void setItemLoc(Location itemLoc) {this.itemLoc = itemLoc;}

    public Calendar getItemExp() {
        return itemExp;
    }

    public void setItemExp(Calendar itemExp) {
        this.itemExp = itemExp;
    }

    @Override
    public String toString(){
        return "Item{" +
                "id=" + getId() +
                ", itemDesc='" + itemDesc + '\'' +
                ", itemLoc='" + itemLoc.getLocName() + '\'' +
                ", itemExp='" + itemExp + '\'' +
            '}';
    }

}
