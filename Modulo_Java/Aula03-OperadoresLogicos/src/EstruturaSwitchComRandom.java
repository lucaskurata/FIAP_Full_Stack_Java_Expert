import java.util.Random;

public class EstruturaSwitchComRandom {

	public static void main(String[] args) {
		/*Crie um programa que permita ao usuário escolher o elogio que gostaria de receber, de a
		 * cordo com a seguinte regra: 1 - Elogio profissional, 2 - Elogio físico, 3 - Elogio pessoal
		 * Caso digite qualquer outro número, deve ser exibida a mensagem "opção inválida"*/
		int opcao;
		System.out.println("ELOGIADOR!");
		Random gerador = new Random();
		opcao = gerador.nextInt(3);
		//Aqui precisamos de uma estrutura para validar a opção inserida.
		switch (opcao) {
		case 0:
			System.out.println("Você é um excelente profissional!");
			break;
		case 1:
			System.out.println("Você aparenta ser muito forte!");
			break;
		case 2:
			System.out.println("Você é um amor em pessoa!");
			break;
		default:
			System.out.println("Opção Inválida!");
			break;			
		}
	}

}
