package br.com.fiap.videolocadora.test;

import br.com.fiap.videolocadora.model.Cliente;
import br.com.fiap.videolocadora.model.Filme;
import br.com.fiap.videolocadora.model.Locacao;
import br.com.fiap.videolocadora.util.DateUtils;

public class LocacaoTest {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Lucas Kurata", "508.851.688-60");
		Filme filme = new Filme("Godzilla", 2012, "Algum diretor");
		
		Locacao locacao = new Locacao();
		locacao.setDataLocacao(DateUtils.stringToDate("19/07/2021"));
		locacao.setPrazoEntrega(DateUtils.stringToDate("21/07/2021"));
		locacao.setValorTotal(18.50);
		locacao.setCliente(cliente);
		locacao.setFilme(filme);
		
		System.out.println(locacao);

	}

}
