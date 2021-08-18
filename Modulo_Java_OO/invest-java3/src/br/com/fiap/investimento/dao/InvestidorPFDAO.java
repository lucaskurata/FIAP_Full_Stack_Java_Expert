package br.com.fiap.investimento.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.investimento.exceptions.DadoNaoAlteradoException;
import br.com.fiap.investimento.exceptions.DadoNaoRemovidoException;
import br.com.fiap.investimento.exceptions.DataBaseException;
import br.com.fiap.investimento.model.InvestidorPF;
import br.com.fiap.investimento.tools.DBTools;

public class InvestidorPFDAO implements GenericDAO<InvestidorPF, Integer> {

	private List<InvestidorPF> listaInvestidores;
	
	public InvestidorPFDAO() {
		listaInvestidores = new ArrayList<>();
		listaInvestidores.add(new InvestidorPF(1, "Felipe", true));
		listaInvestidores.add(new InvestidorPF(2, "Flávio", true));
		listaInvestidores.add(new InvestidorPF(3, "Marihá", false));
		listaInvestidores.add(new InvestidorPF(4, "Leonardo", true));
	}
	
	
	
	public List<InvestidorPF> listarTodos() throws DataBaseException {
		System.out.println("FundoDAO - listarTodos - Fundo:");
		DBTools.obterConexao();
		
		return listaInvestidores;
	}

	
	
	@Override
	public InvestidorPF consultarPorId(Integer chave) throws DataBaseException {
		System.out.println("InvestidorPFDAO - consultarPorId - Investidor:" + chave);
		DBTools.obterConexao();
		
		return listaInvestidores.get(chave.intValue() - 1);
	}

	@Override
	public Integer cadastrar(InvestidorPF entidade) throws DataBaseException  {
		System.out.println("InvestidorPFDAO - Cadastrar - Investidor:" + entidade);
		DBTools.obterConexao();
		
		listaInvestidores.add(entidade);
		return (int) Math.random();
	}

	@Override
	public void alterar(InvestidorPF entidade) throws DataBaseException, DadoNaoAlteradoException {
		System.out.println("InvestidorPFDAO - Alterar - Investidor:" + entidade);
		DBTools.obterConexao();
	}

	
	@Override
	public void excluir(Integer chave) throws DataBaseException, DadoNaoRemovidoException {
		System.out.println("InvestidorPFDAO - Excluir - Investidor:" + chave);
		DBTools.obterConexao();
		
		if ( chave.intValue() == 0 || chave.intValue() == 100) {
			throw new DadoNaoRemovidoException();
		} 
		
	}
	
	
	
	
	
}
