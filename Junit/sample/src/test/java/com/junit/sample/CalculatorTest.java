package com.junit.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator calc = new Calculator();

	@Test
	public void addTest(){
		assertEquals(10, calc.add(5, 5));
	}
	
}
