package ClasseObjeto;

public class Caneta {

	String modelo;
	String cor;
	Double ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Est� tampada? " + this.tampada);
	}
	
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Erro!");
		}else {
			System.out.println("Caneta destampada, rasbicando...");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
	
}
