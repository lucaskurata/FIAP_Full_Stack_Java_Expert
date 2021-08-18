package br.com.fiap.investimento.test;

import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorArrayTest {

	public static void main(String[] args) {
		
		InvestidorPF investores[] = new InvestidorPF[6];
		investores[0] = new InvestidorPF("Flávio", 1);
		investores[1] = new InvestidorPF("Felipe", 15000000);
		investores[2] = new InvestidorPF("Marihá", 1);
		investores[3] = new InvestidorPF("Daniel", 1);
		investores[4] = new InvestidorPF("Guilherme", 1);
		investores[5] = new InvestidorPF("Giovanna", 1);
		
		//removendo o felipe
		investores[1] = null;
		
		for (InvestidorPF investidorPF : investores) {
			System.out.println(investidorPF);
		}
		
		
		
//		String nomes[] = {"Flavio","Eduardo","Moreni"}; 
//		
//		for(int i = 0; i < nomes.length; i++ ) {
//			System.out.println(nomes[i]);
//		}
//		
//		for (   ) {
//			
//		}
		
		/*
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		int valores[] = {22,66,99,00,10,23};
		int numeros[] = new int[100];
		String nomes[] = {"Flavio","Eduardo","Moreni"}; 
		
		for (int i : valores) {
			System.out.println(i);
		}
		
		*/
		
//		int[] valores = {22,66,99,00,10,23};
//		
//		//foreach
//		for (int i : valores) {
//			System.out.println(i);
//		}
		
	}

}
