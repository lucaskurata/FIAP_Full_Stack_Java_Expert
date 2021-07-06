import java.util.Scanner;
public class CalculaMediaNota {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String nome[] = new String[5];
		double nota[] = new double[5];
		
		double media=0;
		
		for(int i = 0; i<nota.length; i++) {
			System.out.println("Digite a nota do Aluno de ordem " + (i+1) + "º");
			nota[i] = leitor.nextDouble();
			
			System.out.println("E o nome do Aluno de ordem " + (i+1) + "º");
			nome[i] = leitor.next();
			
			media = media + nota[i];
		}
		
		media = media / nota.length;
		
		for(int i = 0; i<nota.length; i++) {
			if(nota[i] < media) {
				System.out.println("Chamar o aluno para conversar: " + nome[i] + " com nota de: " + nota[i] + " sendo que a média de nota foi de: " + media);
			}
		}

		leitor.close();
		
	}

}
