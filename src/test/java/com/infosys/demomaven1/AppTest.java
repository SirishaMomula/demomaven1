package com.infosys.demomaven1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void addValidTest()
    {
        App app = new App();
        int expected = 5;
        int actual=app.add(2,3);
        Assertions.assertEquals(expected, actual);
    }
}
