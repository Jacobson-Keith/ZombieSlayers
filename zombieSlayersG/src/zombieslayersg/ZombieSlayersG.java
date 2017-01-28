/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieslayersg;

//Apparently, for each class we create we must IMPORT the class to the main class
//for it's propper use... So everytime we create a new class it'll prompt us
//to import it on the "lightbulb" option, kinda neat, right?

import buyi.cit260.zombieSlayers.model.Door;
import buyi.cit260.zombieSlayers.model.Food;
import buyi.cit260.zombieSlayers.model.Map;
import buyi.cit260.zombieSlayers.model.Player;
import buyi.cit260.zombieSlayers.model.Potion;
import buyi.cit260.zombieSlayers.model.Zombie;

/**
 *
 * @author Chicho
 */
public class ZombieSlayersG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Player playerOne = new Player();
              
       playerOne.setName("Chicho");
       playerOne.setHp(10);
       playerOne.setStr(1);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       
       //Here we can create instances of the classes being developed
       Potion rPotion = new Potion();
       Food ham = new Food();
       Zombie weakZombie = new Zombie();
       Door woodDoor = new Door();
       Map basement3 = new Map();
       
       // Here we can add values to the attributes on those objects calling
       // for their setters functions
       
       rPotion.setType("Red Potion");
       rPotion.setFunction("Restores +5 HP");
       
       ham.setName("Ham");
       ham.setAbility("Restores +1 HP per room for 3 rooms");
       
       weakZombie.setType("Weak Zombie");
       weakZombie.setHp(4);
       weakZombie.setStr(1);
       weakZombie.setDamage(1);
       
       woodDoor.setSturdiness(2);
       
       basement3.setRowCount(1);
       basement3.setColumnCount(1);
       
       // And here we'll print them out to the System, so that we can check
       // everything worked out as planned 
       
       String rPotionInfo = rPotion.toString();
       System.out.println(rPotionInfo);
       
       String hamInfo = ham.toString();
       System.out.println(hamInfo);
       
       String weakZombieInfo = weakZombie.toString();
       System.out.println(weakZombieInfo);
       
       String woodDoorInfo = woodDoor.toString();
       System.out.println(woodDoorInfo);
       
       String basement3Info = basement3.toString();
       System.out.println(basement3Info);
       
    }
    
}
