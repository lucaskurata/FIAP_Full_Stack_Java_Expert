package ObjetosCompostos;

public class UltraEmojiCombat {

	public static void main(String[] args) {

		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Pretty Boy", "Fran�a", 31, 11, 2, 1, 1.75, 68.9);
		l[1] = new Lutador("Putscript", "Brasil", 29, 14, 2, 3, 1.68, 57.8);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 12, 2, 1, 1.65, 80.9);
		l[3] = new Lutador("Dead Code", "Austr�lia", 28, 13, 0, 2, 1.93, 81.6);
		l[4] = new Lutador("UfoCobol", "Brasil", 37, 5, 4, 3, 1.70, 119.3);
		l[5] = new Lutador("Nerdaart", "EUA", 30, 12, 2, 4, 1.81, 105.7);

		l[0].status();
		System.out.println("");
		l[1].status();
		System.out.println("");
		l[2].status();
		System.out.println("");
		l[3].status();
		System.out.println("");
		l[4].status();
		System.out.println("");
		l[5].status();
	}

}
