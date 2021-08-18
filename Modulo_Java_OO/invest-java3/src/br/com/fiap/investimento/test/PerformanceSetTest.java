package br.com.fiap.investimento.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PerformanceSetTest {

	public static void main(String[] args) {
		
		Set<String> listaHash = new HashSet<>();
		Set<String> listaLink = new LinkedHashSet<>();
		Set<String> listaTree = new TreeSet<>();
		
		long inicio = System.nanoTime();
		for( int i = 0; i < 90000; i++) {
			listaHash.add("Nome " + i);
		}
		long fim = System.nanoTime();
		System.out.println("HashSet       :" + ( fim - inicio ));
		
		
		inicio = System.nanoTime();
		for( int i = 0; i < 90000; i++) {
			listaLink.add("Nome " + i);
		}
		fim = System.nanoTime();
		System.out.println("LinkedHashSet :" + ( fim - inicio ));
		
		
		inicio = System.nanoTime();
		for( int i = 0; i < 90000; i++) {
			listaTree.add("Nome " + i);
		}
		fim = System.nanoTime();
		System.out.println("TreeSet       :" + ( fim - inicio ));
		
	}
	
	
}
