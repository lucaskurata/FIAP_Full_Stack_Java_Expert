package br.com.fiap.investimento.business;

public abstract class OperacoesBusiness {

	public void aplicar() {
		System.out.println("Solicitando a autentica��o via QRCode");
		System.out.println("Autentica��o efetuada com sucesso");
		System.out.println("Geral - Aplica��o efetuada com sucesso");
		System.out.println("Token gerado com sucesso");
	}

	public void resgatar() {
		System.out.println("Geral - Resgate efetuado com sucesso");
		System.out.println("Token gerado com sucesso");
	}
	
	public void exibirExtrato() {
		System.out.println("Imprimindo o extrato na tela");
		System.out.println("Trilha na auditoria de impress�o de extrato");
	}
	
	public void exibirExtrato(String formatoGeracaoArquivo) {
		exibirExtrato();
		System.out.println("Gerando o arquivo do tipo " + formatoGeracaoArquivo);
	}
	
	public void exibirExtrato(boolean imprimirLogotipo) {
		exibirExtrato();
		if(imprimirLogotipo) {
			System.out.println("Logotipo");	
		}
		System.out.println("Imprimindo o extrato na tela"); 
		System.out.println("Trilha de auditoria de impress�o do extrato"); 
	}
	
	public void exibirExtrato(boolean imprimirLogotipo, String formatoGeracaoArquivo) {
		exibirExtrato(imprimirLogotipo);
		System.out.println("Gerando o arquivo do tipo " + formatoGeracaoArquivo);
	}
	
}
