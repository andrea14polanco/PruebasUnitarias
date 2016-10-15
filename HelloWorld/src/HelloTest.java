import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {
	HelloWorld h = new HelloWorld();
	@Test
	public void test() {
	long n  = 4, m = 5;
		assertEquals(h.sum(n, m), 9);
	}

}
