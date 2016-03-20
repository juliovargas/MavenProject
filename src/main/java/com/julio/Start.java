package com.julio;

import java.util.*;

import com.julio.classes.*;

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
		
		process(team1.getMembers());
		
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String>  ls = Arrays.asList("one", "two", "three");
		printList(li);
		printList(ls);
		
	}
	
	/**
	 * Wildcard with upper bound
	 * @param list
	 */
	public static void process(List<? extends Animal> list) { 
		System.out.println(list.size());
		
		for (Animal a : list) {
			System.out.println(a.getName());
		}
	}
	
	public static void printList(List<?> list) {
	    for (Object elem: list)
	        System.out.print(elem + " ");
	    System.out.println();
	}
}