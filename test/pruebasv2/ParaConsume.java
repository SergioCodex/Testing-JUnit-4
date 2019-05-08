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
public class ParaConsume {

    FuelTank tanque;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        tanque = new FuelTank(60.0, 50.0);

    }

    @After
    public void tearDown() {

    }

    @Parameters
    public static Iterable data() {
        return Arrays.asList(new Object[][]{{20, 10}, {35, 15}, {30, 20}, {45, 35}});
    }

    private double expected;
    private double quita;

    public ParaConsume(int expected, int quita) {

        this.expected = expected;
        this.quita = quita;

    }

    @Test
    public void paraConsume() {
        tanque.consume(quita);
        double actual_amount = tanque.getTankLevel();

        Assert.assertEquals(expected, actual_amount, 0);

    }

}
