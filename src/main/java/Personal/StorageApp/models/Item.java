package Personal.StorageApp.models;

import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

import java.util.Calendar;
import java.util.Objects;

@Entity
public class Item {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    @NotNull
    private String itemName;

    @Column
    @NotNull
    private String itemDesc;

    @Column
    private String itemLoc;

    @Column
    @NotNull
    @Temporal(TemporalType.DATE)
    private Calendar itemExp;

    public Item() {
    }

    public Item(String name, String desc, String itemLoc, Calendar itemExp){
        this.itemName = name;
        this.itemDesc = desc;
        this.itemLoc = itemLoc;
        this.itemExp = itemExp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id) &&
                Objects.equals(itemName, item.itemName) &&
                Objects.equals(itemDesc, item.itemDesc) &&
                Objects.equals(itemLoc, item.itemLoc)&&
                Objects.equals(itemExp, item.itemExp);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, itemName, itemDesc, itemLoc, itemExp);
    }

    public Long getId() {
        return id;
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

    @Override
    public String toString(){
        return "Item{" +
                "id=" + id +
                ", itemDesc='" + itemDesc + '\'' +
                ", itemLoc='" + itemLoc + '\'' +
                ", itemExp='" + itemExp + '\'' +
            '}';
    }

}
