
public class EntendendoFuncao {
	
	public static void saudacao() {
		System.out.println("Hello, world!");
	}
	
	public static void elogia(String nome) {
		System.out.println("Voc� � muito legal, " + nome);
	}

	public static void main(String[] args) {
		saudacao();
		elogia("Lucas");
		String identifica��o="Andre de Freitas";
		elogia(identifica��o);
	}

}
