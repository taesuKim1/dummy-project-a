package org.batcha.dummy.project.a;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AStuff implements ProjectAAPI {
	
	private Log logger = LogFactory.getLog(AStuff.class);

	@Override
	public String typicalAStuff(String arg) {
		logger.debug("A Stuff can log !");
		logger.debug(arg);
		logger.debug("A Stuff Rocks !");
		return arg;
	}

}
