package beanfactory;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import wsyumi.task.Task;

public class MyBeanFactory {
	public static void main(String... args) {
		DefaultListableBeanFactory registry = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
		reader.loadBeanDefinitions("springAop.xml");
		Task task = (Task) registry.getBean("task");
		task.task();
	}
}
