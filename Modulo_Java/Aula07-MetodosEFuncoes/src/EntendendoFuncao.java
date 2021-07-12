
public class EntendendoFuncao {
	
	public static void saudacao() {
		System.out.println("Hello, world!");
	}
	
	public static void elogia(String nome) {
		System.out.println("VocÊ é muito legal, " + nome);
	}

	public static void main(String[] args) {
		saudacao();
		elogia("Lucas");
		String identificação="Andre de Freitas";
		elogia(identificação);
	}

}
