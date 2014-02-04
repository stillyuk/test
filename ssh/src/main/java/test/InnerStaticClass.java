package test;

import java.lang.reflect.Constructor;

public class InnerStaticClass {

	static {
		System.out.println("outer static");
	}

	static class In {
		public In() {
			
		}
		static {
			System.out.println("inner static");
		}

		public static void main(String[] args) throws Exception {
			Constructor<In> c = In.class.getConstructor((Class<?>[]) null);
			In in = c.newInstance();
			System.out.println(in);
		}
	}
}
