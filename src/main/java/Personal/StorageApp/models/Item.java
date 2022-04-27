package Personal.StorageApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String desc;
    private String loc;
    private Date exp;

    private Item(){};

    private Item(String name, String desc, String loc, Date exp){
        this.name = name;
        this.desc = desc;
        this.loc = loc;
        this.exp = exp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id) &&
                Objects.equals(name, item.name) &&
                Objects.equals(desc, item.desc) &&
                Objects.equals(loc, item.loc)&&
                Objects.equals(exp, item.exp);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name, desc, loc, exp);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }

    @Override
    public String toString(){
        return "Item{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", loc='" + loc + '\'' +
                ", exp='" + exp + '\'' +
            '}';
    }
}
