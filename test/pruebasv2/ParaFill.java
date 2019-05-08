/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasv2;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author root-admin
 */
@RunWith(Parameterized.class)
public class ParaFill {

    FuelTank tank = new FuelTank(60.0, 10.0);

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        

    }

    @After
    public void tearDown() {

    }

    @Parameters
    public static Iterable data() {
        return Arrays.asList(new Object[][]{{20, 10}, {35, 15}, {30, 20}, {45, 35}});
    }

    private double expected;
    private double añade;

    public ParaFill(int expected, int añade) {

        this.expected = expected;
        this.añade = añade;

    }

    @Test
    public void paraFill() {
        tank.fill(añade);
        double actual_amount = tank.getTankLevel();

        Assert.assertEquals(expected, actual_amount, 0);

    }

}
