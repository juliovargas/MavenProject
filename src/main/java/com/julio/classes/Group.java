package com.julio.classes;

import java.util.List;

public class Group {

	private String name;
	private List<Person> members;
	
	public Group(List<Person> members) {
		super();
		this.members = members;
	}

	public List<Person> getMembers() {
		return members;
	}

	public void setMembers(List<Person> members) {
		this.members = members;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
