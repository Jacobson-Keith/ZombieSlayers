/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieSlayers.view;

import byui.cit260.zombieSlayers.control.GameControl;
import static byui.cit260.zombieSlayers.model.Game.player;
import byui.cit260.zombieSlayers.model.Player;
import java.util.Scanner;

/**
 *
 * @author Chicho
 */
public class StartProgramViewZS {
    
    private String promptMessage;
    
    public StartProgramViewZS(){
        
        this.promptMessage = "\nWelcome! What is thy name?";
        
        this.displayBanner();
        
        
    }

public void displayBanner() {

    System.out.println(
              "\n********************************************************"
            + "\n********************************************************"
            + "\n******         WELCOME TO ZOMBIE SLAYERS         *******" 
            + "\n*****                                             ******"
            + "\n****                                                ****"
            + "\n***                                                  ***"
            + "\n**                                                    **"
            + "\n* This is a game of survival, conquest, and above all  *" 
            + "\n* fun. You will need to traverse the many dangers and  *" 
            + "\n* mysteries that lie in store.                         *"
            + "\n*                                                      *"
            + "\n* You will find yourself, trapped in the dungeon of    *"
            + "\n* full of the living dead. Blood and mysterious thing  *"
            + "\n* await your cunning and lucky survial of the dangers  *"
            + "\n* lurking around every room. You will aquire weapons   *"
            + "\n* to protect yourself, open chests to aquire new items *"
            + "\n* ,and find ways to get through locked doors. Your end *"
            + "\n* goal is to make it out of the third dungeon alive,   *"
            + "\n* enjoy fresh air and freedom to live in a world free  *"
            + "\n* of the terrors you just escaped... or have you?      *"
            + "\n*                                                      *"
            + "\n*             GOOD LUCK STRANGER!                      *"
            + "\n*                                                      *"
            + "\n********************************************************"
            ); 

}

 public void displayStartProgramViewZS() {
     
        boolean done = false;
    do {

        String playersName = this.getPlayersName();
        if (playersName.toUpperCase().equals("Q"))
            return;

        done = this.doAction(playersName);


    } while (!done);
}

private String getPlayersName() {
    Scanner keyboard = new Scanner(System.in);
    String value = "";
    boolean valid = false;
    while (!valid) {
        System.out.println("\n" + this.promptMessage);

        value = keyboard.nextLine();
        value = value.trim();

        if (value.length() < 1){
            System.out.println("\nInvalid value: value can not be blank");
            continue;
        }   
        break;
    }
    return value;
}

private boolean doAction(String playersName){
    if (playersName.length() < 2){
        System.out.println("\nInvalid players name: "
        + "The name must be greater than one character in length");
        return false;
    }

    Player player = GameControl.createPlayer(playersName);

    if (player == null) {
        System.out.println("\nError creating the player.");
        return false;
    }

    this.displayNextView();

    return true;
}


    private void displayNextView() {
    System.out.println("\n======================================="
            + "\n Welcome to the game " + player.getName()
            + "\n We hope you have a lot of fun!"
            + "\n======================================="
            );
    
    MainMenuView mainMenuView = new MainMenuView();
            
    mainMenuView.displayMainMenuView();
}

   

}