package com.randreucetti;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public String generateUniqueKey() {
		String id = UUID.randomUUID().toString();
		logger.info("Unique key generated is {}", id);
		return id;
	}
}
