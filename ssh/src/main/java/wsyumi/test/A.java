package wsyumi.test;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author jiangyukun
 * @since 
 *
 */
public class A implements MethodBeforeAdvice {

	private Logger logger = LogManager.getLogger(A.class.getName());

	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		logger.info("before advice");
	}

}
