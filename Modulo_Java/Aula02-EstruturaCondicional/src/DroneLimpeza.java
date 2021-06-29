import java.util.Scanner;

public class DroneLimpeza {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int lixoUm, lixoDois, lixoTres;
		
		System.out.println("Digite o peso do primeiro lixo: ");
		lixoUm = leitor.nextInt();
		
		System.out.println("Digite o peso do segundo lixo: ");
		lixoDois = leitor.nextInt();
		
		System.out.println("Digite o peso do terceiro lixo: ");
		lixoTres = leitor.nextInt();
		
		if(lixoUm < lixoDois && lixoUm < lixoTres){
			System.out.println("O primeiro lixo é o mais leve, portanto, será carregado pelo Drone (" + lixoUm + " kg)");
		}else if (lixoDois < lixoUm && lixoDois < lixoTres) {
			System.out.println("O segundo lixo é o mais leve, portanto, será carregado pelo Drone (" + lixoDois + " kg)");
		}else {
			System.out.println("O terceiro lixo é o mais leve, portanto, será carregado pelo Drone (" + lixoTres + " kg)");
		}

		leitor.close();
		
	}

}