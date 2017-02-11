/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieSlayers.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chicho
 */
public class doorSphingeWeightTest {
    
    public doorSphingeWeightTest() {
    }

    /**
     * Test of calcTotalWight method, of class doorSphingeWeight.
     */
    @Test
    public void testCalcTotalWight() {
        
        /*
        ***************************************************
                            Test Case 1
        ***************************************************
         */
        
        System.out.println("Test Case 1");
        int kilograms = 20;
        int pounds = 60;
        doorSphingeWeight instance = new doorSphingeWeight();
        double expResult = 104;
        double result = instance.calcTotalWight(kilograms, pounds);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("WHAT?! N-No! YOU!... YOU LITTLE RAT!... That's exactly what I was thinking!");
        
        /*
        ***************************************************
                            Test Case 2
        ***************************************************
         */
        
        System.out.println("Test Case 2");
        kilograms = 13;
        pounds = 2;
        expResult = 30.6;
        result = instance.calcTotalWight(kilograms, pounds);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("That's too small");
        
        /*
        ***************************************************
                            Test Case 3
        ***************************************************
         */
        
        System.out.println("Test Case 3");
        kilograms = 80;
        pounds = 50;
        expResult = 226;
        result = instance.calcTotalWight(kilograms, pounds);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("That's too big");
        
        /*
        ***************************************************
                            Test Case 4
        ***************************************************
         */
        
        System.out.println("Test Case 4");
        kilograms = 20;
        pounds = 50;
        expResult = 94;
        result = instance.calcTotalWight(kilograms, pounds);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("That's... Quite close... Close enough I'd dare to say... Ok, you may pass...");
        
        /*
        ***************************************************
                            Test Case 5
        ***************************************************
         */
        
        System.out.println("Test Case 5");
        kilograms = -26;
        pounds = 5;
        expResult = -52.2;
        result = instance.calcTotalWight(kilograms, pounds);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("That's... Floating in the air...");
    }
    
}
