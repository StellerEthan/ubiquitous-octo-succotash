package Personal.StorageApp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Location {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String locName;

    @Column
    private String locDesc;

    public Location(){};

    public Location(String locName, String locDesc){
        this.locName = locName;
        this.locDesc = locDesc;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public String getLocDesc() {
        return locDesc;
    }

    public void setLocDesc(String locDesc) {
        this.locDesc = locDesc;
    }
}
