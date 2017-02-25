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
public class WeightSphingeEncounterView {
    
    private String promptWelcome;
    private String tooBig;
    private String tooSmall;
    private String correct;
    private String perfect;
    
    public WeightSphingeEncounterView() {
        
        this.promptWelcome = "\nYou were still catching your breath when"
                + "\nan eerie voice emaneted from one of the walls,"
                + "\nsoft as a whisper, yet strong as the clash"
                + "\nof a thousand blacksmith's hammers on the work."
                + "\nWHAT A SIGHT! A human that has not died!"
                + "\nA wondrous time to be alive!"
                + "\nI bid you welcome, to the chamber of death, flesh bag."
                + "\nAnd no, I don't speak in riddles nor rythm, so in"
                + "\norder for you to get out of this Dungeon level is to"
                + "\nguess my weight."
                + "\nEasy, is it not?"
                + "\nWell, you have to give me two numbers. The first one in KILOGRAMS."
                + "\nThe second one in POUNDS. If you guessed right, you may pass."
                + "\nIf you didn't... Well, huehuehue... You might not be as lucky"
                + "\non this encounter than you were on your previous one... Huehuehue"
                + "\n";
        
        this.perfect = "\nWHAT?!... YOU!... BUT IT'S IMPOSSIBLE! HOW COULD "
                + "\nYOU BE SO ACCURATE! NOO! YOU CHEATER!"
                + "\nAnd as the door shouted in pain, sorrow, and dispair, you"
                + "\nwatched silently while the face streched out inwards until it's face"
                + "\nbroke into a thousand pieces, allowing you to pass freely.";
        
        this.correct = "\nWell... It's NOT THAT FAR from the perfect answer..."
                + "\n but I fancy you, human. That zombie you just defeated"
                + "\n kept punching my face with his face every once in a while"
                + "\n and you've dealt with him alright... You may pass... For now..."
                + "\n HUE HUE HUE HUE HUE";
        
        this.tooBig = "Is too big";
        this.tooSmall = "Is too small";
}
    public int getPlayersKilograms(){
        
        Scanner keyboard = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println("\n Tell me the weight in Kilograms...");

            value = keyboard.nextInt();

            if (value < 1){
                System.out.println("\nThat's weightless! Gimme something more!");
                continue;
            }   
            break;
            }
        return value;
    }   
    public int getPlayersPounds(){
        
        Scanner keyboard = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println("\n Tell me the weight in Pounds...");

            value = keyboard.nextInt();

            if (value < 1){
                System.out.println("\nThat's weightless! Gimme something more!");
                continue;
            }   
            break;
            }
        return value;
    } 
    
    
    
}


