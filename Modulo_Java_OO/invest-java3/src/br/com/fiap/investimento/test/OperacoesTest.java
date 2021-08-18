package br.com.fiap.investimento.test;

import br.com.fiap.investimento.business.OperacoesInstitucionaisBusiness;
import br.com.fiap.investimento.business.OperacoesPFBusiness;
import br.com.fiap.investimento.business.OperacoesPJBusiness;

public class OperacoesTest {

	public static void main(String[] args) {
		
//		OperacoesBusiness opPai = new OperacoesBusiness();
//		opPai.aplicar();
//		System.out.println("");
		
		OperacoesPFBusiness opPf = new OperacoesPFBusiness();
		//opPf.aplicar();
		//opPf.estornar();
		opPf.resgatar();
		System.out.println("");
		
		OperacoesPJBusiness opPj = new OperacoesPJBusiness();
		//opPj.aplicar();
		//opPj.encerrarInvestimento();
		opPj.resgatar();
		System.out.println("");
		
		
		OperacoesInstitucionaisBusiness opInst = new OperacoesInstitucionaisBusiness();
		opInst.resgatar();
		
		
		
	}
	
}
