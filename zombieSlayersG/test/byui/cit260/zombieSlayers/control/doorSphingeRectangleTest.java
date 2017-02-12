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
public class doorSphingeRectangleTest {
    
    public doorSphingeRectangleTest() {
    }

    /**
     * Test of calcRectangleArea method, of class doorSphingeRectangle.
     */
    @Test
    public void testCalcRectangleArea() {

        /*
        ***********************************************************
                                TEST CASE 1
        ***********************************************************
        */
        
        System.out.println("Test Case #1");
        int firstSide = 4;
        int secondSide = 7;
        doorSphingeRectangle instance = new doorSphingeRectangle();
        int expResult = 28;
        int result = instance.calcRectangleArea(firstSide, secondSide);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.       
        System.out.println("Test Case 1 Passed");
        
        /*
        ***********************************************************
                                TEST CASE 2
        ***********************************************************
        */
        
        System.out.println("Test Case #2");
        firstSide = -1;
        secondSide = 2;
        expResult = -2;
        result = instance.calcRectangleArea(firstSide, secondSide);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("-1 is a negative");
        
        /*
        ***********************************************************
                                TEST CASE 3
        ***********************************************************
        */
        
        System.out.println("Test Case #3");
        firstSide = 5;
        secondSide = -13;
        expResult = -65;
        result = instance.calcRectangleArea(firstSide, secondSide);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("secondSide is a negative");
        
        /*
        ***********************************************************
                                TEST CASE 4
        ***********************************************************
        */
        
        System.out.println("Test Case #4");
        firstSide = 8;
        secondSide = 21;
        expResult = 168;
        result = instance.calcRectangleArea(firstSide, secondSide);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Way too high!");
        
    }

    // Test of validateAnswers method, of class doorSphingeRectangle.
     
    @Test
    public void testValidateAnswers() {
        
        /*
        ***********************************************
                        Test Case 1
        ***********************************************
        */
        
        System.out.println("TC 1");
        int areaRectangle = 28;
        doorSphingeRectangle instance = new doorSphingeRectangle();
        String expResult = "That's!... You!... Just!... OH ALLRIGHT! YOU GOT IT PERFECTLY... You cheater... YOU LOOKED INTO THE CODE, DIDNT YOU?!";
        String result = instance.validateAnswers(areaRectangle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Test Case Passed\nThat's!... You!... Just!... OH ALLRIGHT! YOU GOT IT PERFECTLY... You cheater... YOU LOOKED INTO THE CODE, DIDNT YOU?!");
        
        
        /*
        ***********************************************
                        Test Case 2
        ***********************************************
        */
        
        System.out.println("TC 2");
        areaRectangle = 24;
        expResult = "Well... That's not as accurate as it could be, but it'll do, I guess... Humph...";
        result = instance.validateAnswers(areaRectangle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Well... That's not as accurate as it could be, but it'll do, I guess... Humph...");
        
        /*
        ***********************************************
                        Test Case 3
        ***********************************************
        */
        
        System.out.println("TC 3");
        areaRectangle = 15;
        expResult = "HA! That's not even close! My area is bigger than that!";
        result = instance.validateAnswers(areaRectangle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("HA! That's not even close! My area is bigger than that!");
        
        /*
        ***********************************************
                        Test Case 4
        ***********************************************
        */
        
        System.out.println("TC 4");
        areaRectangle = 32;
        expResult = "HA! I WISH I'D BE THAT BIG! I am smaller than that though...";
        result = instance.validateAnswers(areaRectangle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("HA! I WISH I'D BE THAT BIG! I am smaller than that though...");
    }
}
