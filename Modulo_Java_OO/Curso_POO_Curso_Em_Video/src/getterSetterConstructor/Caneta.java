package getterSetterConstructor;

public class Caneta {

	private String modelo;
	private Double ponta;
	private boolean tampada;
	private  String cor;
	
	public Caneta() {
		this.tampar();
		this.setCor("Azul");
	}
	
	public Caneta(String modelo, String cor, Double ponta) {
		this.tampar();
		this.setModelo(modelo);
		this.setCor(cor);
		this.setPonta(ponta);
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPonta() {
		return ponta;
	}

	public void setPonta(Double ponta) {
		this.ponta = ponta;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("Caneta: ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}

}
