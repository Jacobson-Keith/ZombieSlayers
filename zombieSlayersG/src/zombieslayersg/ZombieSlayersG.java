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
import buyi.cit260.zombieSlayers.model.Weapon;
import buyi.cit260.zombieSlayers.model.Inventory;
import buyi.cit260.zombieSlayers.model.Item;
import buyi.cit260.zombieSlayers.model.Room;
import buyi.cit260.zombieSlayers.model.Treasure;


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
       //Here are the five created by Keith.
       Weapon bastardSword = new Weapon();
       Inventory contents  = new Inventory();
       Item key = new Item();
       Room hallWay = new Room();
       Treasure plainChest = new Treasure();
       
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
       
       bastardSword.setType("Melee");
       bastardSword.setBaseAttack(3);
       bastardSword.setReqStr(2);
       
       contents.setShowContents("The following items are in you inventory: ");
       
       key.setName("Key");
       key.setType("Bronze");
       key.setFunction("Use key to unlock a bronze door to get out of 3rd basement.");
       
       hallWay.setName("Hall Way");
       hallWay.setMapLocation(7);
       hallWay.setDesc("You enter a long hallway that is dimly lit, you can hear moaning coming from the door on the left. A locked door is in front of you, and a slightly ajar door is to your right.");
       
       plainChest.setLock("No");
       plainChest.setSturdiness(1);
       plainChest.setTreasureLvl(1);
       
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
       
       String bastardSwordInfo = bastardSword.toString();
       System.out.println(bastardSwordInfo);
       
       String contentsInfo = contents.toString();
       System.out.println(contentsInfo);
       
       String keyInfo = key.toString();
       System.out.println(keyInfo);
       
       String hallWayInfo = hallWay.toString();
       System.out.println(hallWayInfo);
       
       String plainChestInfo = plainChest.toString();
       System.out.println(plainChestInfo);
    }
    
}
