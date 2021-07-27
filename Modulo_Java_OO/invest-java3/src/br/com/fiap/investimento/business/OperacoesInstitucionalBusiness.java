package br.com.fiap.investimento.business;

public class OperacoesInstitucionalBusiness extends OperacoesBusiness{

	@Override
	public void resgatar() {
		System.out.println("Validar blacklist");
		super.resgatar();
		System.out.println("Assinatura protocolada com sucesso");
	}
	
	public void criarFundoInvestimento() {
		System.out.println("Investimento criado com sucesso");
		System.out.println("Token gerado com sucesso");
	}
	
}
