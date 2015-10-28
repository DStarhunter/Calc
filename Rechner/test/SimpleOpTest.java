/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class SimpleOpTest {
    
    public SimpleOpTest() {
    }

    
    /**
     * Test of plus method, of class SimpleOp.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        /*double op1 = 1.0;
        double op2 = 1.0;
        double expResult = 2.0;
        double result = SimpleOp.plus(op1, op2);*/
        assertEquals(SimpleOp.plus(1.0,1.0), 2.0, 0.00001);
        assertEquals(SimpleOp.plus(154987633.22,552487663.35),707475296.57, 0.00001);
        assertEquals(SimpleOp.plus(-2.0,-2.0),-4.0, 0.00001);
        assertEquals(SimpleOp.plus(-153555666777.0,-543222333555.0),-696778000332.0, 0.00001);
        assertEquals(SimpleOp.plus(0.0,0.0),0.0, 0.00001);
    }

    /**
     * Test of minus method, of class SimpleOp.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        /*double op1 = 1.0;
        double op2 = 1.0;
        double expResult = 0.0;
        double result = SimpleOp.minus(op1, op2);*/
        assertEquals(SimpleOp.minus(4.0, 2.0), 2.0, 0.00001);
        assertEquals(SimpleOp.minus(123456789.0, 987654321.0), -864197532.0, 0.00001);
        assertEquals(SimpleOp.minus(-111222333.0, -987654321.0), 876431988.0, 0.00001);
        assertEquals(SimpleOp.minus(-5.0, -5.0), 0.0, 0.00001);
        assertEquals(SimpleOp.minus(0.0, 0.0), 0.0, 0.00001);
    }

    /**
     * Test of multi method, of class SimpleOp.
     */
    @Test
    public void testMulti() {
        System.out.println("multi");
        /*double op1 = 1.0;
        double op2 = 1.0;
        double expResult = 1.0;
        double result = SimpleOp.multi(op1, op2);
        assertEquals(expResult, result, 0.00001);*/
        assertEquals(SimpleOp.multi(4.0, 2.0), 8.0, 0.00001);
        assertEquals(SimpleOp.multi(123.0, 987654321.0), 121481481483.0, 0.00001);
        assertEquals(SimpleOp.multi(-233.0, -987654321.0), 230123456793.0, 0.00001);
        assertEquals(SimpleOp.multi(-5.0, -5.0), 25.0, 0.00001);
        assertEquals(SimpleOp.multi(0.0, 0.0), 0.0, 0.00001);
    }

    /**
     * Test of divi method, of class SimpleOp.
     */
    @Test
    public void testDivi() {
        System.out.println("divi");
        /*double op1 = 1.0;
        double op2 = 1.0;
        double expResult = 1.0;
        double result = SimpleOp.divi(op1, op2);
        assertEquals(expResult, result, 0.00001);*/
        assertEquals(SimpleOp.divi(4.0, 2.0), 2.0, 0.00001);
        assertEquals(SimpleOp.divi(123456789.0, 987654321.0), 0.124999998860938, 0.00001);
        assertEquals(SimpleOp.divi(-111222333.0, -987654321.0), 0.112612612161092, 0.00001);
        assertEquals(SimpleOp.divi(-5.0, -5.0), 1.0, 0.00001);
        assertEquals(SimpleOp.divi(555.0, 0.0), 0.0, 0.0);//soll 0 returnen
    }
    
}
