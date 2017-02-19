/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieSlayers.model;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
/**
 *
 * @author Keith
 */
public class Room implements Serializable{
    
    //class instance variables
    private String name;
    private String desc;
    private int mapLocation;

    public Room() {
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

    public int getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(int mapLocation) {
        this.mapLocation = mapLocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.desc);
        hash = 89 * hash + this.mapLocation;
        return hash;
    }

    @Override
    public String toString() {
        return "Room{" + "name=" + name + ", desc=" + desc + ", mapLocation=" + mapLocation + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Room other = (Room) obj;
        if (this.mapLocation != other.mapLocation) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.desc, other.desc)) {
            return false;
        }
        return true;
    }
    

    
    
    
}
