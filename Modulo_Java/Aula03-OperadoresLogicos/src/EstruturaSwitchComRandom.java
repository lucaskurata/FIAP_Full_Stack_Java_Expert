import java.util.Random;

public class EstruturaSwitchComRandom {

	public static void main(String[] args) {
		/*Crie um programa que permita ao usu�rio escolher o elogio que gostaria de receber, de a
		 * cordo com a seguinte regra: 1 - Elogio profissional, 2 - Elogio f�sico, 3 - Elogio pessoal
		 * Caso digite qualquer outro n�mero, deve ser exibida a mensagem "op��o inv�lida"*/
		int opcao;
		System.out.println("ELOGIADOR!");
		Random gerador = new Random();
		opcao = gerador.nextInt(3);
		//Aqui precisamos de uma estrutura para validar a op��o inserida.
		switch (opcao) {
		case 0:
			System.out.println("Voc� � um excelente profissional!");
			break;
		case 1:
			System.out.println("Voc� aparenta ser muito forte!");
			break;
		case 2:
			System.out.println("Voc� � um amor em pessoa!");
			break;
		default:
			System.out.println("Op��o Inv�lida!");
			break;			
		}
	}

}
