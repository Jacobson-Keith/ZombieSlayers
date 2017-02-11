/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieSlayers.control;

/**
 *
 * @author Chicho
 */
public class doorSphingeRectangle {
    
    public int calcRectangleArea (int firstSide, int secondSide){
        
        int areaRectangle = firstSide * secondSide;
        
        return areaRectangle;
        
    }
    
    public String validateAnswers (int areaRectangle){

        String perfect = "That's!... You!... Just!... OH ALLRIGHT! YOU GOT IT PERFECTLY... You cheater... YOU LOOKED INTO THE CODE, DIDNT YOU?!";
        String correct = "Well... That's not as accurate as it could be, but it'll do, I guess... Humph...";
        String wrongSmall = "HA! That's not even close! My area is bigger than that!";
        String wrongBig = "HA! I WISH I'D BE THAT BIG! I am smaller than that though...";
        
        
        if (areaRectangle == 28){
            return perfect;
        }
        else if (areaRectangle < 24){
            return wrongSmall;
        }
        else if (areaRectangle > 30){
            return wrongBig;
        }
        else {
            return correct;
        }
    } 
    
    
}
