import java.util.Scanner;

public class RoboCombate {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int distancia;
		System.out.println("Digite a distância do robo inimigo: ");
		distancia = leitor.nextInt();
		
		if(distancia < 70) {
			System.out.println("ATIVADO!");
		}else {
			System.out.println("DESATIVADO");
		}

		leitor.close();
		
	}

}
