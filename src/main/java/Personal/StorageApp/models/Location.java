package Personal.StorageApp.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Location extends AbstractEntity {

    @Column
    private String locName;

    public Location() {
    }

    public Location(String locName) {
        this.locName = locName;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }
}
