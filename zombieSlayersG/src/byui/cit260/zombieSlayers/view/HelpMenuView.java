/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieSlayers.view;

import java.util.Scanner;

public class HelpMenuView {

    private final String menu;

    public void displayHelpMenuView(){
      
        boolean done = false;
        do {
            String helpMenuOption = this.getHelpMenuOption();
            if (!helpMenuOption.toUpperCase().equals("Q")) {
            } else {
                return;
            }
            
            done = this.doAction(helpMenuOption);
            
        } while (!done);
        
    }

        public HelpMenuView() {
        this.menu = "\n"
                + "\n-----------------------------------------"
                + "|    Help Menu                             |"
                + "\n-----------------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move?"
                + "\nP - How to pick up object?"
                + "\nI - How to view your inventory?"
                + "\nA - How to attack?"
                + "\nS - How to save game?"
                + "\nW - How to win the game?"
                + "\nB - Go back to Main Menu"
                + "\n-----------------------------------------";
    }
    
    private String getHelpMenuOption() {
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.startGameGoal();
                break;
            case "M":
                this.startHowMove();
                break;
            case "P":
                this.startPickObject();
                break;
            case "I":
                this.startShowInventory();
                break;
            case "A":
                this.startHowAttack();
                break;
            case "S":
                this.startHowSave();
                break;
            case "W":
                this.startHowWin();
                break;
            case "B":
                this.goback();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }   
        return true;
    }

    private void startGameGoal() {
        System.out.println("\n*** The goal of the game is to excape the dungeons alive. Good luck!***");
        HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.displayHelpMenuView();
    }
    private void startHowMove() {
        System.out.println("\n*** Using the four keys you can move around ***"
                +          "\n*** U = North, K = East, H = West, J = South***");
        HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.displayHelpMenuView();
    }

    private void startPickObject() {
        System.out.println("\n*** In order to pick up objects type (pick up)     ***"
                         + "\n*** Then type the name of object as show on screen ***");
        HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.displayHelpMenuView();
    }

    private void startShowInventory() {
        System.out.println("\n*** Press I inorder to view a list of your inventory***");
        HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.displayHelpMenuView();
    }

    private void startHowAttack() {
        System.out.println("\n*** Press A and then type the name of object you want to attack***"
                         + "\n*** Example: A Zombie --> Do you want to attack Zombie? Y/N");
        HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.displayHelpMenuView();
    }

    private void startHowSave() {
        System.out.println("\n*** To save the game type S and it will save you game. if you   ***"
                         + "\n*** restart the game then it will clear previously saved game.  ***");
        HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.displayHelpMenuView();
    }

    private void startHowWin() {
        System.out.println("\n*** In order to win the game you must open the gold door ***"
                         + "\n*** in the third dungeon to excape the horrors with-in!  ***");
        HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.displayHelpMenuView();
    }

    private void goback() {
        MainMenuView mainMenuView = new MainMenuView();
             mainMenuView.displayMainMenuView();
    }
}
