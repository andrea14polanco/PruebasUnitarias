package test;
import static org.junit.Assert.*;

import org.junit.Test;

import Hello.hello;

public class HelloTest {
	hello h = new hello();
	@Test
	public void test() {
	long n  = 4, m = 5;
		assertEquals(h.sum(n, m),14);
	}

}
