package br.com.fiap.investimento.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorMapTest {

	public static void main(String[] args) {
		InvestidorPF[] arrayList = new InvestidorPF[10];
		List<InvestidorPF> lista = new ArrayList<>();
		Set<InvestidorPF> setList = new HashSet<>();
		
		/*
		// Map
		Map<String,String> mapaNomes = new TreeMap<String,String>();
		mapaNomes.put("chave 2", "valor 2");
		mapaNomes.put("chave 3", "valor 3");
		mapaNomes.put("chave 1", "valor 1");
		mapaNomes.put("chave 2", "valor 22");
		mapaNomes.put("chave 2", "valor 222");

		System.out.println(mapaNomes);
		*/
		
		InvestidorPF i1 = new InvestidorPF(191, "Flávio", 10);
		InvestidorPF i2 = new InvestidorPF(192, "Eduardo", 20);
		InvestidorPF i3 = new InvestidorPF(193, "Moreni", 30);
		InvestidorPF i4 = new InvestidorPF(194, "Silva", 40);
		InvestidorPF i5 = new InvestidorPF(193, "Moreni 193-5", 30);
		InvestidorPF i6 = new InvestidorPF(193, "Moreni 193-6", 30);
		
		Map<Integer, InvestidorPF> mapa = new HashMap<Integer,InvestidorPF>();
		mapa.put( i1.getInvestidorId() , i1);
		mapa.put( i2.getInvestidorId() , i2);
		mapa.put( i3.getInvestidorId() , i3);
		mapa.put( i4.getInvestidorId() , i4);
		mapa.put( i5.getInvestidorId() , i5);
		mapa.put( i6.getInvestidorId() , i6);
		
		Integer idBusca = 194;
		System.out.println( mapa.containsKey(idBusca) );
		System.out.println( mapa.containsValue( null ));
		
		InvestidorPF invBusca = mapa.get(idBusca);
		System.out.println(invBusca);
		
		
		//mapa.keySet().stream().filter( m -> "Flavio".equals(m.getInteger(1)) );
		
		for( Integer id : mapa.keySet() ) {
			System.out.println(id);
		}
		
		
		
		
		for ( InvestidorPF investidorPF : mapa.values() ) {
			System.out.println(investidorPF);
		}
		
		//System.out.println(mapa);
		
	}

}


/*

SELECT * FROM TB_Investidor 



SELECT * FROM TB_Investidor ( 300 linhas ) offset 1 quero 20 linhas

SELECT * FROM TB_Investidor ( 300 linhas ) offset 2 quero 20 linhas

SELECT * FROM TB_Investidor ( 300 linhas ) offset 4 quero 20 linhas



*/
