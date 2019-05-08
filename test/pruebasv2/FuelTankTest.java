/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasv2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root-admin
 */
public class FuelTankTest {

    FuelTank tank;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        tank = new FuelTank(40.0, 0.0);

    }

    @After
    public void tearDown() {

    }

    /**
     * Test of getTankLevel method, of class FuelTank.
     */
    @Test
    public void testGetTankLevel() {
        System.out.println("getTankLevel");
        double expResult = 0.0;
        double result = tank.getTankLevel();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTankMax method, of class FuelTank.
     */
    @Test
    public void testGetTankMax() {
        System.out.println("getTankMax");
        double expResult = 40.0;
        double result = tank.getTankMax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class FuelTank.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        boolean expResult = true;
        boolean result = tank.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class FuelTank.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        boolean expResult = false;
        boolean result = tank.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
