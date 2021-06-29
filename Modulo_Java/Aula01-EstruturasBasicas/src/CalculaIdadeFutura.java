import java.util.Scanner;

public class CalculaIdadeFutura {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int dataNascimento;
		System.out.println("Digite o ano do seu nascimento: ");
		dataNascimento = leitor.nextInt();
		
		int idadeFutura;
		idadeFutura = 2021 - dataNascimento;
		
		System.out.println("Em 31 de Dezembro de 2021, você terá: " + idadeFutura + " anos");
		
		leitor.close();

	}

}
