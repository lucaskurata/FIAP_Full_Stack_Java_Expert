import java.util.Scanner;

public class DesvioSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Uma ONG criou um jogo para alertar as pessoas sobre os riscos das drogas.
		 *Por se tratar de um assunto sens�vel, ficou decidido que a idade m�nima para jogar � de 12 anos.
		 *Sua fun��o � criar um programa que receba a idade do usu�rio e exiba a mensagem "Voc� pode jogar" caso ele tenha 12 anos ou mais. */
		
		Scanner leitor = new Scanner(System.in);
		int idade;
		System.out.println("Por favor, digite a sua idade!");
		idade = leitor.nextInt();
		System.out.println("Deixe-me verificar sua idade...");
		
		//A baixo, temos um if simples apenas quando o resultado do teste � verdadeiro
		if (idade >= 12) {
			System.out.println("Voc� poder� jogar por ter no m�nimo 12 anos!");
		}
		
		leitor.close();
	}

}
