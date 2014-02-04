package spring;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangyukun
 * @since 2014-01-17 17:36
 */
public class ProxyFactoryBeanTest {

	/**
	 * 
	 */
	@SuppressWarnings({ "resource" })
	@Test
	public void testProxyFactory() {
		BeanFactory factory = new ClassPathXmlApplicationContext("proxyFactory.xml");
		factory.getBean("proxyFactory");
	}
}
