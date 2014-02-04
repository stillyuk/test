package test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author jiangyukun
 * @since 2014-1-27 15:38
 *
 */
@Component
public class Z {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		Log logger = LogFactory.getLog(Z.class);
		logger.info("!!!!");
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("test");
		B b = (B) context.getBean(B.class);
		logger.info(b);
		context.close();
	}

	public void doSomething() {
		System.out.println("...");
	}

	@Bean
	public B mockB() {
		return new B();
	}
}
