package com.julio.lambdas;

import java.util.List;
	
@FunctionalInterface
public interface Retriever {
	
	public List<String> filter(List<String> data);
}