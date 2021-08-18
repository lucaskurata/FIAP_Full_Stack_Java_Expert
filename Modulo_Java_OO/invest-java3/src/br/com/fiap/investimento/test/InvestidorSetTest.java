package br.com.fiap.investimento.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import br.com.fiap.investimento.model.Fundo;
import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorSetTest {

	public static void main(String[] args) {

		/*
		Set<Fundo> fundos = new TreeSet<>();
		fundos.add(new Fundo(1,"Fundo 1"));
		fundos.add(new Fundo(3,"Fundo 3"));
		fundos.add(new Fundo(2,"Fundo 2"));
		fundos.add(new Fundo(4,"Fundo 4"));
		fundos.add(new Fundo(1,"Fundo 1"));
		System.out.println(fundos.size());
		System.out.println(fundos);
		*/
		
		Set<InvestidorPF> investidores = new TreeSet<>();
		investidores.add(new InvestidorPF("Inv 1", 10));
		investidores.add(new InvestidorPF("Inv 3", 30));
		investidores.add(new InvestidorPF("Inv 2", 20));
		investidores.add(new InvestidorPF("Inv 4", 40));
		investidores.add(new InvestidorPF("Inv 1", 10));
		investidores.add(new InvestidorPF("Inv 1", 110));
		System.out.println(investidores.size());
		System.out.println(investidores);
		
	}

}


/*

[
InvestidorPF [getCpf()=null, getInvestidorId()=0, getNome()=Inv 1, getPatrimonio()=10.0, getPerfilRisco()=null, getDataAberturaConta()=null], 
InvestidorPF [getCpf()=null, getInvestidorId()=0, getNome()=Inv 3, getPatrimonio()=30.0, getPerfilRisco()=null, getDataAberturaConta()=null], 
InvestidorPF [getCpf()=null, getInvestidorId()=0, getNome()=Inv 2, getPatrimonio()=20.0, getPerfilRisco()=null, getDataAberturaConta()=null], 
InvestidorPF [getCpf()=null, getInvestidorId()=0, getNome()=Inv 4, getPatrimonio()=40.0, getPerfilRisco()=null, getDataAberturaConta()=null]]

*/

