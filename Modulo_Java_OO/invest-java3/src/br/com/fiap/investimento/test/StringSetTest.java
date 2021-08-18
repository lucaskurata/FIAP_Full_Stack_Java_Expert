package br.com.fiap.investimento.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringSetTest {

	public static void main(String[] args) {

		//Set<String> lista = new HashSet<>();
		//Set<String> lista = new LinkedHashSet<>();
		Set<String> lista = new TreeSet<>();
		lista.add("Victor");
		lista.add("Flávio");
		lista.add("Giovanna");
		lista.add("Marihá");
		lista.add("Flávio");
		lista.add("Giovanna");
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		System.out.println(lista);
		
		
	}

}
