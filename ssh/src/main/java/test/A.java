package test;

import java.net.URL;
import java.net.URLClassLoader;

public class A extends URLClassLoader {
	static {
		System.out.println("static");
	}

	public A(URL[] urls) {
		super(urls);
		System.out.println("A'construtor");
	}
}

class C extends A {
	public C(URL[] urls) {
		super(urls);
		System.out.println("c' construtor");
	}

	public static void main(String[] args) throws Throwable {
		System.out.println(ClassLoader.getSystemClassLoader());
	}

	public void f() {
		new D();
	}
}

class D {
	static {
		System.out.println("d' static");
	}
}