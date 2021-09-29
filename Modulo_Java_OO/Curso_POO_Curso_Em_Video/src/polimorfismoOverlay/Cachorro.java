package polimorfismoOverlay;

public class Cachorro extends Lobo{

	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
		
	}
	
	
	public void reagir(String frase) {
	
		if(frase == "Ol�" || frase == "Comer") {
			System.out.println("Abanar e Latir");
		}else {
			System.out.println("Rosnar");
		}
		
	}
	
	public void reagir(int hora, int minuto) {
		
		if(hora < 12) {
			System.out.println("Abanar o rabo");
		}else if(hora >= 18) {
			System.out.println("Ignorar");
		}else {
			System.out.println("Abanar e Latir");
		}
		
	}
	
	public void reagir(boolean dono) {
		
		if(dono) {
			System.out.println("Abanar");
		}else {
			System.out.println("Rosnar e Latir");
		}
		
	}
	
	public void reagir(int idade, double peso) {
		
		if(idade < 5) {
			if(peso < 10) {
				System.out.println("Abanar");
			}else {
				System.out.println("Latir");
			}
		}else {
			if(peso < 10) {
				System.out.println("Rosnar");
			}else {
				System.out.println("Ignorar");
			}
		}		
	}
	
}
