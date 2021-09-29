package polimorfismoOverride;

public class AnimalTest {

	public static void main(String[] args) {

		Mamifero m1 = new Mamifero();
		System.out.println("***** Mamífero *****");
		m1.setPeso(63.00);
		m1.setIdade(21);
		m1.setMembros(4);
		m1.setCorPelo("Preto");
		m1.alimentar();
		m1.emitirSom();
		m1.locomover();
		System.out.println(m1.toString());
		System.out.println("********************\n");
		
		Reptil r1 = new Reptil();
		System.out.println("***** Réptil *****");
		r1.setPeso(08.27);
		r1.setIdade(3);
		r1.setMembros(4);
		r1.setCorEscama("Verde");
		r1.alimentar();
		r1.emitirSom();
		r1.locomover();
		System.out.println(r1.toString());
		System.out.println("********************\n");
		
		Peixe p1 = new Peixe();
		System.out.println("***** Peixe *****");
		p1.setPeso(05.13);
		p1.setIdade(8);
		p1.setMembros(0);
		p1.setCorEscama("Cinza");
		p1.alimentar();
		p1.emitirSom();
		p1.locomover();
		System.out.println(p1.toString());
		System.out.println("********************\n");
		
		Ave v1 = new Ave();
		System.out.println("***** Ave *****");
		v1.setPeso(3.40);
		v1.setIdade(2);
		v1.setMembros(2);
		v1.setCorPena("Vermelho com azul");
		v1.alimentar();
		v1.emitirSom();
		v1.locomover();
		System.out.println(v1.toString());
		System.out.println("********************\n");
		
		Cachorro c1 = new Cachorro();
		System.out.println("***** Cachorro *****");
		c1.setPeso(13.40);
		c1.setIdade(12);
		c1.setMembros(4);
		c1.setCorPelo("Marrom");
		c1.alimentar();
		c1.emitirSom();
		c1.locomover();
		System.out.println(c1.toString());
		System.out.println("********************\n");
		
		Tartaruga t1 = new Tartaruga();
		System.out.println("***** Tartaruga *****");
		t1.setPeso(8.40);
		t1.setIdade(8);
		t1.setMembros(0);
		t1.setCorEscama("Marrom");
		t1.alimentar();
		t1.emitirSom();
		t1.locomover();
		System.out.println(t1.toString());
		System.out.println("********************\n");

		GoldFish g1 = new GoldFish();
		System.out.println("***** Gold Fish *****");
		g1.setPeso(1.12);
		g1.setIdade(2);
		g1.setMembros(2);
		g1.setCorEscama("Dourado");
		g1.alimentar();
		g1.emitirSom();
		g1.locomover();
		System.out.println(g1.toString());
		System.out.println("********************\n");
		
		Arara a1 = new Arara();
		System.out.println("***** Arara *****");
		a1.setPeso(3.40);
		a1.setIdade(2);
		a1.setMembros(2);
		a1.setCorPena("Verde");
		a1.alimentar();
		a1.emitirSom();
		a1.locomover();
		System.out.println(a1.toString());
		System.out.println("********************");
		
	}

}
