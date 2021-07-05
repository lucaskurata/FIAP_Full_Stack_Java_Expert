import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int numero, res;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o número para ser calculado a tabuada: ");
		numero = leitor.nextInt();
		
		for (int i=1; i<=10; i++) {
			res = numero * i;
			System.out.println(numero + " x " + i + " = " + res);
		}

	}

}
