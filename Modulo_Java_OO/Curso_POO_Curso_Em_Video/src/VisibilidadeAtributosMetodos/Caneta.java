package VisibilidadeAtributosMetodos;

public class Caneta {

	public String modelo;
	public String cor;
	private Double ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Erro!");
		}else {
			System.out.println("Caneta destampada, rasbicando...");
		}
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
	}

	public Double getPonta() {
		return ponta;
	}

	public void setPonta(Double ponta) {
		this.ponta = ponta;
	}
	
}
