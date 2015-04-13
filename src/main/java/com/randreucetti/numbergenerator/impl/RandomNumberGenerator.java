package com.randreucetti.numbergenerator.impl;

import java.util.Random;

import com.randreucetti.numbergenerator.NumberGeneratorBase;

/**
 * 
 * @author randreucetti
 * <p> A random number generator</p>
 */
public class RandomNumberGenerator extends NumberGeneratorBase {

	private Random r = new Random();
	@Override
	public String generateKey() {
		String key = String.valueOf(r.nextInt());
		logger.info("Key generated is: {}", key);
		return key;
	}

}
