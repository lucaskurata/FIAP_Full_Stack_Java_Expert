package getterSetterConstructor;

public class Aula04 {
		
	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.status();
				
		System.out.println("");
		
		c1.setModelo("Bic-Crystal");
		c1.setPonta(0.5);
		c1.status();

		System.out.println("");
		
		Caneta c2 = new Caneta("Bic", "Preta", 1.0);
		c2.status();
		
	}
		
}
