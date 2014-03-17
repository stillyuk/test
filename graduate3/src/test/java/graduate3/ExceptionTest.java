package graduate3;

import org.junit.Test;

public class ExceptionTest {
	@Test
	public void testException() throws Exception {
		try {
			throw new Exception("aa");
		} catch (Exception e) {
			try {
				throw e;
			} catch (Exception e1) {
				throw e;
			}
		}
	}
}
