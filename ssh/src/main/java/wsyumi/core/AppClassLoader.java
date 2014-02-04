package wsyumi.core;

import java.net.URL;
import java.net.URLClassLoader;

public class AppClassLoader extends URLClassLoader {

	public AppClassLoader(URL[] urls) {
		super(urls);
	}

}
