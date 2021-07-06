import java.util.Scanner;
public class ExibeAtividade {
/*Faça um programa que permita ao usuário digitar 30 atividades que ele realizou no dia. Ao final, o programa deve possibilitar que o usuário escolha se quer exibir as atividades na ordem em que digitou ou em ordem reversa.*/

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String atividades[] = new String[5];
		
		int ordem;
		
		for(int i = 0; i < atividades.length; i++) {
			System.out.println("Digite as suas Atividades: ");
			atividades[i] = leitor.next();
		}
		
		System.out.println("Qual ordem deseja exibir? ");
		System.out.println("1 -> Em ordem \n2 -> Invertido");
		ordem = leitor.nextInt();
		
		if(ordem == 1) {
			for(int i = 0; i < atividades.length; i++) {
				System.out.println("Ordem digitada: " + atividades[i]);
			}
		}else if(ordem == 2){
			for(int i = atividades.length-1; i >= 0; i--) {
				System.out.println("Ordem invertida: " + atividades[i]);
			}			
		}else {
			System.out.println("Opção inválida");
		}
		
		leitor.close();
	}

}
