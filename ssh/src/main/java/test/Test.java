package test;

import java.net.URL;

import wsyumi.thread.SimpleThread;
import wsyumi.utils.PropertiesUtil;
import wsyumi.utils.SleepUtil;

public class Test {
	public static void main(String[] args) throws Exception {

		URL[] url = new URL[] { new URL("file", "localhost", PropertiesUtil.PROJECT_PATH) };
		A a = new A(url);
//		Class<?> c = a.loadClass("cglib.A");
//		a.close();
//		Method method = c.getMethod("something");
//		method.invoke(c.newInstance());
		Runnable run = new SimpleThread();
		Thread thread = new Thread(run);
		thread.setContextClassLoader(a);
		thread.start();

		try {
			SleepUtil.sleep(5000);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
