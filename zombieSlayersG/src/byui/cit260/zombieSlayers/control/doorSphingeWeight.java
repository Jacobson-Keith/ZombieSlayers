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
public class doorSphingeWeight {
    
    public double calcTotalWight (int kilograms, int pounds){
        double KGM_PER_POUND = 2.20;
        double totalWeight = (kilograms * KGM_PER_POUND) + pounds;
        
        return totalWeight;
    }
}
