package com.julio.classes;

import java.util.List;

public class Group <T> {

	private String name;
	private List<T> members;
	
	public Group(List<T> members) {
		super();
		this.members = members;
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
	
	public void addPersonToGroup(T p) {
		members.add(p);
	}
	
}
