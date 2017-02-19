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
public class Weapon implements Serializable{
    
    //class instance variables
    private String type;
    private double baseAttack;
    private int reqStr;

    public Weapon() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(double baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getReqStr() {
        return reqStr;
    }

    public void setReqStr(int reqStr) {
        this.reqStr = reqStr;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.type);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.baseAttack) ^ (Double.doubleToLongBits(this.baseAttack) >>> 32));
        hash = 89 * hash + this.reqStr;
        return hash;
    }

    @Override
    public String toString() {
        return "Weapon{" + "type=" + type + ", baseAttack=" + baseAttack + ", reqStr=" + reqStr + '}';
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
        final Weapon other = (Weapon) obj;
        if (Double.doubleToLongBits(this.baseAttack) != Double.doubleToLongBits(other.baseAttack)) {
            return false;
        }
        if (this.reqStr != other.reqStr) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    

    
    
    
    
    
}
