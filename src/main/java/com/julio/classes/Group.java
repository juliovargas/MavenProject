package com.julio.classes;

import java.util.ArrayList;
import java.util.List;

public class Group <T extends Animal> {

	private String name;
	private List<T> members;
	
	public Group(String name, List<T> members) {
		super();
		this.name = name;
		this.members = members;
	}

	public Group() {
		this.setName("");
		this.members = new ArrayList<T>();				
	}
	
	public List<T> getMembers() {
		return members;
	}

	public void setMembers(List<T> members) {
		this.members = members;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void add(T p) {
		members.add(p);
	}
}
