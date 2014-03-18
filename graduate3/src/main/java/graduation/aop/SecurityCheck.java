package graduation.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author jiangyukun
 * @since 2014-03-12 13:58
 */
@Component
@Aspect
public class SecurityCheck {

	Log logger = LogFactory.getLog(SecurityCheck.class);

	/**
	 * @since 2014-03-18 16:59
	 */
	@Pointcut("execution(* graduation.webspring.*.*(..))")
	public void loginCheck() {
	}

	@Before("execution(* graduation.webspring.*.*(..))")
	public void start() {
		logger.warn("aop start");
	}
}
