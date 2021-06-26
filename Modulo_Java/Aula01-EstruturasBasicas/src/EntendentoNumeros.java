import java.util.Scanner;

public class EntendentoNumeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Calculadora\n");
		
		int valor1;		
		System.out.println("Por favor, digite o primeiro valor");
		valor1 = leitor.nextInt();

		int valor2;
		System.out.println("Por favor, digite o segundo valor");
		valor2 = leitor.nextInt();

		int soma;		
		soma = valor1 + valor2;		
		System.out.println("O resultado da soma do valor 1 e do valor 2 é: " + soma);
		
		int subtracao;
		subtracao = valor1 - valor2;		
		System.out.println("O resultado da subtração do valor 1 e do valor 2 é: " + subtracao);
		
		int multiplicacao;
		multiplicacao = valor1 * valor2;
		System.out.println("O resultado da multiplicação do valor 1 pelo valor 2 é: " + multiplicacao);
		
		double divisao;
		divisao = (double)valor1 / (double)valor2;
		System.out.println("O resultado da divisao do valor 1 pelo valor 2 é: " + divisao);
		
		leitor.close();

	}

}
