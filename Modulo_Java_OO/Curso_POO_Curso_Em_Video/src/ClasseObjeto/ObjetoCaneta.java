package ClasseObjeto;

public class ObjetoCaneta {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();

		c1.cor = "Azul";
		c1.ponta = 1.5;
		c1.destampar();
		
		c1.rabiscar();
		
		System.out.println("");
		c1.status();
		
	}

}
