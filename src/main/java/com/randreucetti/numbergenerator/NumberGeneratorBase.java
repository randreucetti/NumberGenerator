package com.randreucetti.numbergenerator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author randreucetti
 *<p>Abstract base class to allow for simple logging.</p>
 */
public abstract class NumberGeneratorBase implements NumberGenerator {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
}
