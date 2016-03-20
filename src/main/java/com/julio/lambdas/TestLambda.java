package com.julio.lambdas;

import java.util.Arrays;
import java.util.List;

public class TestLambda {

	public static void main(String[] args) {
		TreatData treatData = new TreatData();
		
		List<String> list = treatData.obtainData(data -> data.subList(2, 4));
		
		System.out.println("Result: " + Arrays.toString(list.toArray()));
	}
}