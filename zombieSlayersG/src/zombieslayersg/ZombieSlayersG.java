/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieslayersg;

//Apparently, for each class we create we must IMPORT the class to the main class
//for it's propper use... So everytime we create a new class it'll prompt us
//to import it on the "lightbulb" option, kinda neat, right?

import byui.cit260.zombieSlayers.model.Door;
import byui.cit260.zombieSlayers.model.Food;
import byui.cit260.zombieSlayers.model.Game;
import byui.cit260.zombieSlayers.model.Map;
import byui.cit260.zombieSlayers.model.Player;
import byui.cit260.zombieSlayers.model.Potion;
import byui.cit260.zombieSlayers.model.Zombie;
import byui.cit260.zombieSlayers.model.Weapon;
import byui.cit260.zombieSlayers.model.Inventory;
import byui.cit260.zombieSlayers.model.Item;
import byui.cit260.zombieSlayers.model.Room;
import byui.cit260.zombieSlayers.model.Treasure;
import byui.cit260.zombieSlayers.view.StartProgramViewZS;


/**
 *
 * @author Chicho
 */
public class ZombieSlayersG {

    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ZombieSlayersG.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ZombieSlayersG.player = player;
    }
    
    public static void main(String[] args) {
        
        
        
        StartProgramViewZS startProgramViewZS = new StartProgramViewZS();
        //startProgramViewZS.displayBanner();
        startProgramViewZS.displayStartProgramViewZS();
        
    }
    
}
