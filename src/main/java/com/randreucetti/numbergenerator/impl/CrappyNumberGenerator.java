package com.randreucetti.numbergenerator.impl;

import com.randreucetti.numbergenerator.NumberGeneratorBase;

/**
 * 
 * @author randreucetti
 * <p> A poor number generator that can yet return the meaning of life..
 */
public class CrappyNumberGenerator extends NumberGeneratorBase {

	@Override
	public String generateKey() {
		String key = "42";
		logger.info("Key generated is: {}", key);
		return key;
	}

}
