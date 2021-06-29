import java.util.Scanner;

public class CalculaTempoFilme {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int minutos;
		System.out.println("Digite o tempo do filme em minutos: ");
		minutos = leitor.nextInt();
		
		int horas, segundos;
		
		horas = minutos / 60;
		segundos = minutos * 60;
		
		System.out.println("O filme de " + minutos + " minutos em horas é de: " + horas + " hora(s) e em segundos é de: " + segundos + " segundo(s)");
		leitor.close();

	}

}
