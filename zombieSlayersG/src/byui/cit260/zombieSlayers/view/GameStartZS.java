/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieSlayers.view;

import java.util.Scanner;

/**
 *
 * @author Chicho
 */
public class GameStartZS {
    
    private String promptMessage;
    
    public GameStartZS(){
        
        this.promptMessage = "\nWelcome! What is thy name?";
        
        this.displayBanner();
        
        
    }

    public void displayBanner() {
        
        System.out.println(""
                + "\n******************************************************"
                + "\n******************************************************"
                + "WELCOME TO ZOMBIE SLAYERS                             **"
                + "\n*   asdsd                                           **"
                + "\n* sdasd *"
                + "\n* asd *"
                + "\n* asd *"
                + "\n* asd *"
                + "\n* asd *"
                + "\n******************************"
        );
        
    }

    public void displayMenuView() {
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
            System.out.println("\nInvalid players name: ");
        }
        return true;
    }
    
    
    
    
}
