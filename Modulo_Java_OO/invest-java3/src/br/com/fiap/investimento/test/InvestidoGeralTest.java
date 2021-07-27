package br.com.fiap.investimento.test;

import br.com.fiap.investimento.model.InvestidorPF;
import br.com.fiap.investimento.model.InvestidorPj;

public class InvestidoGeralTest {

	public static void main(String[] args) {

		InvestidorPF invPf = new InvestidorPF("508.851.688-60","Lucas Kurata", 10000);
		
		System.out.println(invPf);
		
		InvestidorPj invPj = new InvestidorPj("508.851.688-60",1,"Henrique", 10000);
		
		System.out.println(invPj);

	}

}
