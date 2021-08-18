package br.com.fiap.investimento.business;

public class OperacoesInstitucionaisBusiness extends OperacoesBusiness {

	@Override
	public void resgatar() {
		System.out.println("Validar backlist");
		super.resgatar();
		System.out.println("Assinatura protocolada com sucesso");
	}
	
	public void criarFundoInvestimento() {
		System.out.println("Fundo de investimento criado com sucesso");
	}
	
}
