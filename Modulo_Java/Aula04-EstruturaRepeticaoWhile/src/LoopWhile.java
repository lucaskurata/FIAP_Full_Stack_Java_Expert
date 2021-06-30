import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/
		Scanner leitor = new Scanner(System.in);
		int quantidade;
		System.out.println("Quantos alunos existem? ");
		quantidade = leitor.nextInt();
		
		int i=0;
		int soma=0;
		int media;
		int idade=0;
		
		while (i < quantidade) {
			System.out.println("Digite a idade do " + (i+1) + "º aluno: ");
			idade = leitor.nextInt();
			soma = soma + idade;
			i++;
		}
		
		media = soma/quantidade;
		System.out.println("A média de idades dos alunos é: " + media);
		leitor.close();		
		
		
	}

}
