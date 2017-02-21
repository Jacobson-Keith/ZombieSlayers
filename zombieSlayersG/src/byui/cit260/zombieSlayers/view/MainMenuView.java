/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieSlayers.view;

import byui.cit260.zombieSlayers.control.GameControl;
import java.util.Scanner;
import zombieslayersg.ZombieSlayersG;

/**
 *
 * @author Chicho
 */
public class MainMenuView {
    
    private String menu;
    
    public void displayMainMenuView(){
        boolean done = false;
        do{
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    }

    public MainMenuView() {
        this.menu = "\n"
                + "\n-----------------------------------------"
                + "|    Main Menu                             |"
                + "\n-----------------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n-----------------------------------------";
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        while (!valid) {
           System.out.println("\n" + this.menu);
            
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

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }   
        return true;
    }

    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
        GameControl.createNewGame(ZombieSlayersG.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("*** saveGame() function called ***");
    }
    
    
}
