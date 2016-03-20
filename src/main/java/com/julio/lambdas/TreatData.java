package com.julio.lambdas;

import java.util.ArrayList;
import java.util.List;

public class TreatData {

	List<String> lista = new ArrayList<String>();

	public TreatData() {
		lista.add("a");
		lista.add("b");
		lista.add("c");
		lista.add("d");
	}

	List<String> obtainData(Retriever recuperador){
		return recuperador.filter(lista);
	}

}