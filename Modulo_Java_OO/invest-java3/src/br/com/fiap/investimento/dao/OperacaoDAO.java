package br.com.fiap.investimento.dao;

import java.util.Date;
import java.util.List;

import br.com.fiap.investimento.exceptions.DadoNaoAlteradoException;
import br.com.fiap.investimento.exceptions.DadoNaoRemovidoException;
import br.com.fiap.investimento.exceptions.DataBaseException;
import br.com.fiap.investimento.model.Fundo;
import br.com.fiap.investimento.model.InvestidorPF;
import br.com.fiap.investimento.model.OperacaoPF;
import br.com.fiap.investimento.tools.DBTools;

public class OperacaoDAO implements GenericDAO<OperacaoPF, Integer> {

	
	@Override
	public List<OperacaoPF> listarTodos() throws DataBaseException {
		throw new DataBaseException("Operação não autorizada");
	}

	@Override
	public OperacaoPF consultarPorId(Integer chave) throws DataBaseException {
		Fundo fundo = new Fundo(1,"Fundo 1");
		InvestidorPF investidor = new InvestidorPF(1,"Flávio");
		
		return new OperacaoPF(1, fundo, investidor, 1000, new Date() );
	}

	@Override
	public Integer cadastrar(OperacaoPF entidade) throws DataBaseException {
		System.out.println("*********************************************************");
		System.out.println("*********************************************************");
		System.out.println("OperacaoDAO - Cadastrar - OperacaoPF:" + entidade);
		System.out.println("*********************************************************");
		System.out.println("*********************************************************");
		DBTools.obterConexao();
		
		return (int) Math.random();
	}

	@Override
	public void alterar(OperacaoPF entidade) throws DataBaseException, DadoNaoAlteradoException {
		throw new DataBaseException("Operação não autorizada");
	}

	@Override
	public void excluir(Integer chave) throws DataBaseException, DadoNaoRemovidoException {
		throw new DataBaseException("Operação não autorizada");
	}

	
	
}
