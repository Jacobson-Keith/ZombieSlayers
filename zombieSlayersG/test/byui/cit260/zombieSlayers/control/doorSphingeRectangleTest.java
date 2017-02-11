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
        
        System.out.println("/t Test Case #1");
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
        
        System.out.println("/t Test Case #2");
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
        
        System.out.println("/t Test Case #3");
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
        
        System.out.println("/t Test Case #4");
        firstSide = 8;
        secondSide = 21;
        expResult = 168;
        result = instance.calcRectangleArea(firstSide, secondSide);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Way too high!");
        
    }

    /**
     * Test of validateAnswers method, of class doorSphingeRectangle.
     
    @Test
    public void testValidateAnswers() {
        System.out.println("validateAnswers");
        int areaRectangle = 2000;
        doorSphingeRectangle instance = new doorSphingeRectangle();
        String expResult = "That's!... You!... Just!... OH ALLRIGHT! YOU GOT IT PERFECTLY... You cheater... YOU LOOKED INTO THE CODE, DIDNT YOU?!";
        String result = instance.validateAnswers(areaRectangle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    * */
    
}
