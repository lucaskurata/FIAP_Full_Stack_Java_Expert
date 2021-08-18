package br.com.fiap.investimento.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.investimento.exceptions.DataBaseException;
import br.com.fiap.investimento.model.Fundo;
import br.com.fiap.investimento.tools.DBTools;

public class FundoDAO implements GenericDAO<Fundo, Integer> {

	private List<Fundo> listaFundos;
	
	public FundoDAO() {
		listaFundos = new ArrayList<>();
		listaFundos.add( new Fundo(1, "Fundo 1", true));
		listaFundos.add( new Fundo(2, "Fundo 2", true));
		listaFundos.add( new Fundo(3, "Fundo 3", false));
		listaFundos.add( new Fundo(4, "Fundo 4", true));
	}
	
	
	@Override
	public List<Fundo> listarTodos() throws DataBaseException {
		System.out.println("FundoDAO - listarTodos - Fundo:");
		DBTools.obterConexao();
		
		return listaFundos;
	}

	@Override
	public Fundo consultarPorId(Integer chave) throws DataBaseException {
		System.out.println("FundoDAO - consultarPorId - Fundo:" + chave);
		DBTools.obterConexao();
		
		return listaFundos.get(chave.intValue() - 1);
	}

	@Override
	public Integer cadastrar(Fundo entidade) throws DataBaseException {
		System.out.println("FundoDAO - Cadastrar - Fundo:" + entidade);
		DBTools.obterConexao();
		
		listaFundos.add(entidade);
		return (int) Math.random();
	}

	@Override
	public void alterar(Fundo entidade) throws DataBaseException {
		System.out.println("FundoDAO - Alterar - Fundo:" + entidade);
		DBTools.obterConexao();
	}

	@Override
	public void excluir(Integer chave) throws DataBaseException {
		System.out.println("FundoDAO - Excluir - Fundo:" + chave);
		DBTools.obterConexao();
	}

	
	
}
