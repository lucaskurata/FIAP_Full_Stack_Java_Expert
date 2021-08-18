package br.com.fiap.investimento.reports;

public class PJReport implements Report {

	@Override
	public void print(String redeImpressora) {
		System.out.println("PJ print");
	}

	@Override
	public void pdf() {
		System.out.println("PJ pdf");
	}

	@Override
	public void excel() {
		System.out.println("PJ excel");
	}

	@Override
	public void txt() {
		System.out.println("PJ txt");
	}


	
	
	
}
