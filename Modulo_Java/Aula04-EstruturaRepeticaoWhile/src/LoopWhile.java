import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		Scanner leitor = new Scanner(System.in);
		int quantidade;
		System.out.println("Quantos alunos existem? ");
		quantidade = leitor.nextInt();
		
		int i=0;
		int soma=0;
		int media;
		int idade=0;
		
		while (i < quantidade) {
			System.out.println("Digite a idade do " + (i+1) + "� aluno: ");
			idade = leitor.nextInt();
			soma = soma + idade;
			i++;
		}
		
		media = soma/quantidade;
		System.out.println("A m�dia de idades dos alunos �: " + media);
		leitor.close();		
		
		
	}

}
