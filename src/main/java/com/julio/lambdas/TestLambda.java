package com.julio.lambdas;

import java.util.Arrays;
import java.util.List;

public class TestLambda {

	public static void main(String[] args) {
		TratarDatos tratarDatos = new TratarDatos();
		
		List<String> lista = tratarDatos.obtenerDatos(datos -> datos.subList(2, 4));
		
		System.out.println("Resultado: " + Arrays.toString( lista.toArray()) );

	}
}