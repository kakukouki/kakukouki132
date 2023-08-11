package com.dreamtank.maven;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(5, 3);
        int expectedResult = 8;
        assertEquals(expectedResult, actualResult);
        System.out.println("test method have been called11");
    }
}
