import java.util.Scanner;

public class TrocaVariaveis {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int A, B;
		System.out.println("Digite o valor de A: ");
		A = leitor.nextInt();
		System.out.println("Digite o valor de B: ");
		B = leitor.nextInt();
		
		int AAntesTroca;
		int BAntesTroca;
		
		AAntesTroca = A;
		BAntesTroca = B;
		
		//INPUT
		//A = 5
		//B = 10

		A = A + B;
		B = A - B;
		A = A - B;

		
		System.out.println("O valor de A que antes era (" + AAntesTroca + "), agora é :" + A);
		System.out.println("O valor de B que antes era (" + BAntesTroca + "), agora é :" + B);

		leitor.close();
		
	}

}
