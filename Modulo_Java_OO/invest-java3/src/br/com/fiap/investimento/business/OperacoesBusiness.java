package br.com.fiap.investimento.business;

public abstract class OperacoesBusiness {
   
	public void aplicar() {
		System.out.println("Solicitando a autentição via QRCode");
		System.out.println("Autenticação efetuação para aplicação");
		System.out.println("Geral - Aplicação efetuada com sucesso");
		System.out.println("Token gerado com sucesso");
		System.out.println(this.getClass());
	}
	
	public void resgatar() {
		System.out.println("Geral - Resgate efetuado com sucesso");
		System.out.println("Token gerado com sucesso");
	}
	
	private void exibirExtrato() {
		System.out.println("Imprimindo o extrato na tela");
		System.out.println("Trilha de auditoria de impressão do extrato");
	}
	
	public void exibirExtrato(String formatoGeracaoArquivo) {
		exibirExtrato();
		System.out.println("Gerando o arquivo do tipo " + formatoGeracaoArquivo);
	}
	
	public void exibirExtrato(boolean imprimirLogotipo) {
		if (imprimirLogotipo) {
			System.out.println("Logotipo");
		}
		exibirExtrato();
	}
	
	public void exibirExtrato(boolean imprimirLogotipo, String formatoGeracaoArquivo) {
		exibirExtrato(imprimirLogotipo);
		System.out.println("Gerando o arquivo do tipo " + formatoGeracaoArquivo);
	}
	
}












