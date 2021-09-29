package Encapsulamento;

public class ControleRemotoTest {

	public static void main(String[] args) {

		ControleRemoto c = new ControleRemoto();
		
		c.ligar();
		
		System.out.println("Aumentando o volume: ");
		c.maisVolume();
		c.abrirMenu();
		
		System.out.println("\nLigando o mudo: ");
		c.ligarMudo();
		c.abrirMenu();
		
		System.out.println("\nDesligando o mudo: ");
		c.desligarMudo();
		c.abrirMenu();
		
		System.out.println("\nDiminuindo o volume: ");
		c.menosVolume();
		c.abrirMenu();
		
		System.out.println("\nDando play na TV: ");
		c.play();
		c.abrirMenu();
		
		System.out.println("\nDando pause na TV: ");
		c.pause();
		c.abrirMenu();
		
		System.out.println("\nDesligando a TV: ");
		c.desligar();
		c.abrirMenu();
		c.fecharMenu();
		
	}
	
}
