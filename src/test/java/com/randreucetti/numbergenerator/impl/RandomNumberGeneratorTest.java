package com.randreucetti.numbergenerator.impl;

import org.junit.Assert;
import org.junit.Test;

public class RandomNumberGeneratorTest {
	@Test
	public void testNumberNotNull() {
		RandomNumberGenerator generator = new RandomNumberGenerator();
		Assert.assertNotNull(generator.generateKey());
	}
}
