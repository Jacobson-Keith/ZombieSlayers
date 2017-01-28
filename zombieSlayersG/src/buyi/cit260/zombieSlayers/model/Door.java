/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.zombieSlayers.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Chicho
 */
public class Door implements Serializable{
    
    private int sturdiness;

    public int getSturdiness() {
        return sturdiness;
    }

    public void setSturdiness(int sturdiness) {
        this.sturdiness = sturdiness;
    }

    public Door() {
    }

    @Override
    public String toString() {
        return "Door{" + "sturdiness=" + sturdiness + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.sturdiness;
        return hash;
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
        final Door other = (Door) obj;
        if (this.sturdiness != other.sturdiness) {
            return false;
        }
        return true;
    }
    
    
    
}
