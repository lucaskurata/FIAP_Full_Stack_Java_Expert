import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2=0;
		int opcao = 0;
		
		while (opcao!=6) {
			FuncoesMatematicas.exibirMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\n\nDigite o 1º valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2º valor:");
				valor2 = leitor.nextDouble();
				
				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
				
				break;
			case 2:
				FuncoesMatematicas.somar(valor1, valor2);
				
				break;
			case 3:
				FuncoesMatematicas.subtracao(valor1, valor2);
				break;
			case 4:
				FuncoesMatematicas.divisao(valor1, valor2);
				break;
			case 5:
				FuncoesMatematicas.multiplicacao(valor1, valor2);
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		
		leitor.close();
		
	}

}
