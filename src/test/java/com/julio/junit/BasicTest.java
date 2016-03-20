package com.julio.junit;

import org.junit.Test;
import static org.junit.Assert.*;
import com.julio.classes.Human;

public class BasicTest {

	@Test
	public void test2() {
		
		Human p1 = new Human ("pepe", 24);
		assertEquals("pepe", p1.getName());
	}
}
