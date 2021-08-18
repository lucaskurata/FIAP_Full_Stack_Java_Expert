package br.com.fiap.investimento.test;

import java.util.ArrayList;
import java.util.List;
import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorListTest {

	public static void main(String[] args) {

		// List - Interface pai
		// ArrayList - Concreta
		List<InvestidorPF> investidores = new ArrayList<InvestidorPF>();
		investidores.add(new InvestidorPF("Felipe", 10));
		investidores.add(new InvestidorPF("Flávio", 11));
		investidores.add(new InvestidorPF("Marihá", 12));
		investidores.add(new InvestidorPF("Leonardo", 13));

		
		InvestidorPF invBusca = new InvestidorPF("Flávio", 11);
		System.out.println("Encontrou? " +  investidores.contains(invBusca) );
		
		investidores.remove(invBusca);
		
		for (InvestidorPF investidorPF : investidores) {
			System.out.println(investidorPF);
		}

	}

}
