package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * @author jiangyukun
 *
 */
public class JunitTest {

	Logger logger = LogManager.getLogger(JunitTest.class.getName());

	/**
	 * @since 2014-01-16 16:36
	 */
	@Test
	public void testJunit() {
		logger.debug(this);
	}

	@Test
	public void testJunit2() {
		logger.info(this);
	}
}
