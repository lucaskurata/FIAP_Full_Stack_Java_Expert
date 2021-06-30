import java.util.Scanner;

public class AcertarQtdFeijoes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int qtd=0;
		int tentativas=0;
		int i = 0;
		while(i < 1) {
			System.out.println("Quantos feijões existem no jarro? ");
			qtd = leitor.nextInt();
			tentativas+=1;
			if(qtd == 1238) {
				System.out.println("Depois de " + (tentativas-1) + " tentativas, você acertou");
				i = 1;
			}
		}

	}

}
