import java.util.Scanner;
public class EntendendoVetores {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Criação de um Vetor
		int vetor[] = new int[5];

		vetor[0] = 00;
		vetor[1] = 10;
		vetor[2] = 20;
		vetor[3] = 30;
		vetor[4] = 40;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe um valor para o Vetor: ");
			vetor[i] = leitor.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Vetor: " + vetor[i]);
		}
		
		leitor.close();
		
	}

}
