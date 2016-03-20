package com.julio.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Group <T extends Animal> {

	private String name;
	private List<T> members;
	private Optional<T> leader;
	
	public Group(String name, List<T> members) {
		super();
		this.name = name;
		this.members = members;
		this.leader = Optional.empty();
	}

	public Group() {
		this.setName("");
		this.members = new ArrayList<T>();
		this.leader = Optional.empty();
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

	public Optional<T> getLeader() {
		return leader;
	}

	public void setLeader(Optional<T> leader) {
		this.leader = leader;
	}
}
