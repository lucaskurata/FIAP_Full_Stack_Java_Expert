package br.com.fiap.investimento.test;

//import br.com.fiap.investimento.business.OperacoesBusiness;
import br.com.fiap.investimento.business.OperacoesInstitucionalBusiness;
import br.com.fiap.investimento.business.OperacoesPJBusiness;
import br.com.fiap.investimento.business.OperacoresPFBusiness;

public class OperacoresBusinessGeralTest {

	public static void main(String[] args) {
		
//		OperacoesBusiness opePai = new OperacoesBusiness();
//		opePai.aplicar();
//		
//		System.out.println("\n");
		
		OperacoresPFBusiness opeBPF = new OperacoresPFBusiness();
		opeBPF.estornar();
		opeBPF.aplicar();
		opeBPF.resgatar();
		
		System.out.println("\n");
		
		OperacoesPJBusiness opePj = new OperacoesPJBusiness();
		opePj.encerrarInvestimento();
		opePj.aplicar(); 
		opePj.resgatar(); 
		
		System.out.println("\n");
		
		OperacoesInstitucionalBusiness opeInst = new OperacoesInstitucionalBusiness();
//		opeInst.criarFundoInvestimento();
//		opeInst.aplicar();
		opeInst.resgatar();
		//Protocolar a assinatura do representante.
	}
	
}
