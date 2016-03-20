package com.julio;

import java.util.*;
import com.julio.classes.Person;

public class Start {

	/**
	 * Java main method.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Person p1 = new Person ("pepe", 24);
		Person p2 = new Person ("juan", 21);
		
		List<Person> l = new ArrayList<Person>();
		
		l.add(p1);
		l.add(p2);
				
		for (Person p : l) {
			System.out.println("Name: " + p.getName());
		}
		
		Iterator<Person> i = l.iterator();
		
		Map<String, Person> map = new HashMap<String, Person>();
		
		map.put("pepe", p1);
		map.put("juan", p2);
		
		System.out.println(map.get("pepe").getName());
	}
}