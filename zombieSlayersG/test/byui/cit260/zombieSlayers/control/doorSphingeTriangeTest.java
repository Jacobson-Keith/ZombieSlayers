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
 * @author JacobsonKe
 */
public class doorSphingeTriangeTest {
    
    public doorSphingeTriangeTest() {
    }

    @Test
    public void testCalcTriArea() {
        
     /*
     **************************************
                TEST CASE 1
     **************************************
     */
        
        System.out.println("Test Case #1");
        int sideOne = 14;
        int sideTwo = 16;
        doorSphingeTriange instance = new doorSphingeTriange();
        int expResult = 112;
        int result = instance.calcTriArea(sideOne, sideTwo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("That is correct.");
        
        /*
     **************************************
                TEST CASE 2
     **************************************
     */
        
        System.out.println("Test Case #2");
        sideOne = -3;
        sideTwo = 5;
        expResult = -7;
        result = instance.calcTriArea(sideOne, sideTwo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Side One cannot be a negative!");
        
        /*
     **************************************
                TEST CASE 3
     **************************************
     */
        
        System.out.println("Test Case #3");
        sideOne = 7;
        sideTwo = -12;
        expResult = -42;
        result = instance.calcTriArea(sideOne, sideTwo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Side Two cannot be a negative!");
        
         /*
     **************************************
                TEST CASE 3
     **************************************
     */
        
        System.out.println("Test Case #3");
        sideOne = 20;
        sideTwo = 27;
        expResult = 270;
        result = instance.calcTriArea(sideOne, sideTwo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Way too high!");
    }
    
}
