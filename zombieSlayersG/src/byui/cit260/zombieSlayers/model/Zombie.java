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
 * @author Chicho
 */
public class Zombie implements Serializable{
    
    private String type;
    private int hp;
    private int str;
    private int damage;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Zombie() {
    }

    @Override
    public String toString() {
        return "Zombie{" + "type=" + type + ", hp=" + hp + ", str=" + str + ", damage=" + damage + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.type);
        hash = 37 * hash + this.hp;
        hash = 37 * hash + this.str;
        hash = 37 * hash + this.damage;
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
        final Zombie other = (Zombie) obj;
        if (this.hp != other.hp) {
            return false;
        }
        if (this.str != other.str) {
            return false;
        }
        if (this.damage != other.damage) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    
}
