package com.randreucetti.numbergenerator.impl;

import org.junit.Assert;
import org.junit.Test;

public class CrappyNumberGeneratorTest {
	@Test
	public void testValueOfCrappyNumber() {
		CrappyNumberGenerator generator = new CrappyNumberGenerator();
		Assert.assertEquals("42", generator.generateKey());
	}
}
