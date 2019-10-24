package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTestSpy {
	
	Calculator calculator = new Calculator();
	
	@Test
	public void addTest1() {
		
		Calculator calculatorSpy = Mockito.spy(Calculator.class);
		//Mockito.when(calculator.add(100, 50)).thenReturn(100);
		Mockito.when(calculator.add(100, 50)).thenCallRealMethod();
		assertEquals(150, calculator.add(100, 50));
	}
}
