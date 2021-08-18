package br.com.fiap.investimento.reports;

public class PFReport implements Report {

	@Override
	public void print(String redeImpressora) {
		System.out.println("PF print");
	}

	@Override
	public void pdf() {
		System.out.println("PF pdf");
	}

	@Override
	public void excel() {
		System.out.println("PF excel");
	}

	@Override
	public void txt() {
		System.out.println("PF txt");
	}

	
	
}
