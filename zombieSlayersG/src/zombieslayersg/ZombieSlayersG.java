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
import byui.cit260.zombieSlayers.view.GameStartZS;


/**
 *
 * @author Chicho
 */
public class ZombieSlayersG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GameStartZS gameStart = new GameStartZS();
        gameStart.displayBanner();
        gameStart.displayMenuView();
        
    }
    
}
