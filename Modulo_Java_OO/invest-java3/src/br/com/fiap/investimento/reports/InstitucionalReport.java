package br.com.fiap.investimento.reports;

public class InstitucionalReport implements Report{

	@Override
	public void print(String redeImpressora) {
		System.out.println("Enviando para impressora");
	}

	@Override
	public void pdf() {
		System.out.println("Gerando PDF");
	}

	@Override
	public void excel() {
		System.out.println("Gerando excel");
	}

	@Override
	public void txt() {
		System.out.println("Gerando txt");
	}
	
}
