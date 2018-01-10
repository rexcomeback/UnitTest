package eason.unittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by easonzhang on 2018/1/10.
 */
public class CalculatorTest {
    Calculator mCalculator;
    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }

    @Test
    public void sum() throws Exception {
        mCalculator.sum(0,0);
        assertEquals(0,mCalculator.sum(1,1),0);
    }

}