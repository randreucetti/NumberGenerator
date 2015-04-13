package com.randreucetti.numbergenerator.impl;

import org.junit.Assert;
import org.junit.Test;

public class UUIDNumberGeneratorTest {
	@Test
	public void testLengthOfTheUniqueKey(){
		UUIDNumberGenerator generator = new UUIDNumberGenerator();
		Assert.assertEquals(36, generator.generateKey().length());
	}
}
