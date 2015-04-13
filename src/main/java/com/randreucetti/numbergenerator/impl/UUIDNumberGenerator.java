package com.randreucetti.numbergenerator.impl;

import java.util.UUID;

import com.randreucetti.numbergenerator.NumberGeneratorBase;

/**
 * 
 * @author randreucetti
 * <p> A UUID "number" generator</p>
 */
public class UUIDNumberGenerator extends NumberGeneratorBase {

	@Override
	public String generateKey() {
		String id = UUID.randomUUID().toString();
		logger.info("Key generated is: {}", id);
		return id;
	}

}
