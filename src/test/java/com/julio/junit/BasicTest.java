package com.julio.junit;

import org.junit.Test;
import static org.junit.Assert.*;
import com.julio.classes.Person;

public class BasicTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		
		Person p1 = new Person ("pepe", 24);
		assertEquals("pepe", p1.getName());
	}
}
