package com.julio;

import java.util.*;

import com.julio.classes.Group;
import com.julio.classes.Human;

public class Start {

	/**
	 * Java main method.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Human p1 = new Human ("pepe", 24);
		Human p2 = new Human ("juan", 21);
		
		List<Human> l = new ArrayList<Human>();
		
		l.add(p1);
		l.add(p2);
				
		for (Human p : l) {
			System.out.println("Name: " + p.getName());
		}
		
		Iterator<Human> i = l.iterator();
		
		Map<String, Human> map = new HashMap<String, Human>();
		
		map.put("pepe", p1);
		map.put("juan", p2);
		
		System.out.println(map.get("pepe").getName());
		
		Group<Human> team1 = new Group<Human>();
		team1.add(p1);
		team1.add(p2);
		
		System.out.println(team1.getMembers().size());
	}
}