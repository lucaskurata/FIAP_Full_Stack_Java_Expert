package br.com.fiap.investimento.business;

import java.util.Date;

import br.com.fiap.investimento.dao.FundoDAO;
import br.com.fiap.investimento.dao.InvestidorPFDAO;
import br.com.fiap.investimento.dao.OperacaoDAO;
import br.com.fiap.investimento.exceptions.AplicacaoException;
import br.com.fiap.investimento.exceptions.DataBaseException;
import br.com.fiap.investimento.model.Fundo;
import br.com.fiap.investimento.model.InvestidorPF;
import br.com.fiap.investimento.model.OperacaoPF;

public class AplicacaoBusiness {
	
	public void aplicar(Fundo fundo, InvestidorPF investidor, double valor) throws AplicacaoException {
	
		FundoDAO fundoDAO = new FundoDAO();
		InvestidorPFDAO investidorDAO = new InvestidorPFDAO();
		OperacaoDAO operacaoDAO = new OperacaoDAO();
		
		if (valor < 0.1) {
			throw new AplicacaoException("Valor incorreto");
		}
		
		//� utilizado para tratar e exibir uma mensagem mais amig�vel ao inv�s de lan�ar uma exce��o muito t�cnica (databaseexception)
		try {
			Fundo fundoConsultado = fundoDAO.consultarPorId(fundo.getFundoId());
			
			if (fundoConsultado == null) {
				throw new AplicacaoException("Fundo inexistente");				
			}else {
				if (! fundoConsultado.isEhAberto()) {
					throw new AplicacaoException("Fundo fechado para aplica��o");
				}
			}
			
			InvestidorPF investidorConsultado = investidorDAO.consultarPorId(investidor.getInvestidorId());
			
			if(investidorConsultado == null) {
				throw new AplicacaoException("Investidor n�o encontrado");
			}else{
				if(!investidorConsultado.isEhAtivo()) {
					throw new AplicacaoException("Investidor inativado, opera��o n�o permitida");
				}
			}
			
			OperacaoPF operacaoPF = new OperacaoPF(fundoConsultado, investidorConsultado, valor, new Date()); 
			
			operacaoDAO.cadastrar(operacaoPF);
			
		} catch (DataBaseException e) {
			throw new AplicacaoException("Problemas t�cnicos, tente novamente");
		} finally {
			fundoDAO = null;
			operacaoDAO = null;
			investidorDAO = null;
		}
		
	}

}
