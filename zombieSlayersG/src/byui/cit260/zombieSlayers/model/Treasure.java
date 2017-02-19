/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieSlayers.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Keith
 */
import java.util.Objects;/**
 *
 * @author Keith
 */
public class Treasure implements Serializable{
    
    //class instance variables
    private String lock;
    private int sturdiness;
    private int treasureLvl;

    public Treasure() {
    }

    public String getLock() {
        return lock;
    }

    public void setLock(String lock) {
        this.lock = lock;
    }

    public int getSturdiness() {
        return sturdiness;
    }

    public void setSturdiness(int sturdiness) {
        this.sturdiness = sturdiness;
    }

    public int getTreasureLvl() {
        return treasureLvl;
    }

    public void setTreasureLvl(int treasureLvl) {
        this.treasureLvl = treasureLvl;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.lock);
        hash = 29 * hash + this.sturdiness;
        hash = 29 * hash + this.treasureLvl;
        return hash;
    }

    @Override
    public String toString() {
        return "Treasure{" + "lock=" + lock + ", sturdiness=" + sturdiness + ", treasureLvl=" + treasureLvl + '}';
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
        final Treasure other = (Treasure) obj;
        if (this.sturdiness != other.sturdiness) {
            return false;
        }
        if (this.treasureLvl != other.treasureLvl) {
            return false;
        }
        if (!Objects.equals(this.lock, other.lock)) {
            return false;
        }
        return true;
    }
    
    
    
}
