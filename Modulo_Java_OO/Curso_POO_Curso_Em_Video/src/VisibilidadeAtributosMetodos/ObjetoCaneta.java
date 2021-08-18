package VisibilidadeAtributosMetodos;

public class ObjetoCaneta {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.modelo = "Bic-Crystal";
		c1.cor = "Azul";
		c1.setPonta(0.5);
		c1.carga = 80;
		c1.tampada = true;
		c1.rabiscar();
		
		c1.status();
		
	}

}
