package br.com.fiap.investimento.business;

public class OperacoesPFBusiness extends OperacoesBusiness {

	public void estornar() {
		System.out.println("Estorno efetuado com sucesso");
		System.out.println("Token gerado com sucesso");
	}
	
	public void resgatarParcial() {
		System.out.println("Resgate parcial efetuado com sucesso");
		System.out.println("Token gerado com sucesso");
	}

	public void exibirExtrato(boolean imprimirLogotipo, boolean imprimirRodape) {
		super.exibirExtrato(imprimirLogotipo);
		if ( imprimirRodape ) {
			System.out.println("Rodapé do relatório");
		}
	}
	
}
