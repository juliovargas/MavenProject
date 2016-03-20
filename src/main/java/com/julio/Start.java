package com.julio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.julio.classes.Animal;
import com.julio.classes.Group;
import com.julio.classes.Human;

public class Start {

	/**
	 * Java main method.
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		/*System.out.println("Please type a number: ");
		Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int n2 = sc.nextInt();
	    sc.nextLine();
	    String b = sc.nextLine();
	    System.out.println(n1);
	    System.out.println(n2);
	    System.out.println(b);*/
	    
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
		
		System.out.println("Team size: " + team1.getMembers().size());
		System.out.println("Team leader: " + team1.getLeader().toString());
		
		process(team1.getMembers());
		
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String>  ls = Arrays.asList("one", "two", "three");
		printList(li);
		printList(ls);
		
		LocalDate today = LocalDate.now();
		LocalDate dateOfBirth = LocalDate.of(2012, Month.MAY, 14);
		LocalDate firstBirthday = dateOfBirth.plusYears(1);
		
		LocalDateTime todayWithTime = LocalDateTime.now();
		
		System.out.println(today);
		System.out.println(todayWithTime);
		System.out.printf("%s\n", todayWithTime);
		
		Date today2 = new Date();
		System.out.println(today2);
		
		lineOrientedIO();
		loadDefaultProperties();
	
		Sandbox sandbox = new Sandbox();
		
		//Environment properties
		Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }
        
        //System properties
        System.out.println(System.getProperty("os.name"));
        Properties systemProp = System.getProperties();
        System.out.println(systemProp);
        /*Enumeration<?> enums = systemProp.propertyNames();
        for (; enums.hasMoreElements();) {
            String key = enums.nextElement().toString();
            System.out.println(enums.nextElement().toString() + " : " + systemProp.getProperty(key));
        }*/
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
	
	public static void lineOrientedIO () throws IOException {
		BufferedReader inputStream = null;
        BufferedWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new BufferedWriter(new FileWriter("characteroutput.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.write(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
	}
	
	public static void loadDefaultProperties() throws IOException {
		Properties defaultProps = new Properties();
		FileInputStream in = new FileInputStream("defaultProperties");
		defaultProps.load(in);
		in.close();
		
		System.out.println(defaultProps.getProperty("name"));
	}
}