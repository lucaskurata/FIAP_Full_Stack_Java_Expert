package br.com.fiap.investimento.reports;

public class InstitucionalReport implements Report {

	@Override
	public void print(String redeImpressora) {
		System.out.println("Inst print");
	}

	@Override
	public void pdf() {
		System.out.println("Inst pdf");
	}

	@Override
	public void excel() {
		System.out.println("Inst excel");
	}

	@Override
	public void txt() {
		System.out.println("Inst txt");
	}
	
}
