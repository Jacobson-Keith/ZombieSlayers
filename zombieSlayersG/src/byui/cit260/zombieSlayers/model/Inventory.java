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
public class Inventory implements Serializable {
    
    //class instance variables
    private String showContents;

    public Inventory() {
    }
    
    public String getShowContents() {
        return showContents;
    }

    public void setShowContents(String showContents) {
        this.showContents = showContents;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.showContents);
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "showContents=" + showContents + '}';
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.showContents, other.showContents)) {
            return false;
        }
        return true;
    }
    
    
    
}
