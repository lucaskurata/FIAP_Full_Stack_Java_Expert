import java.util.Scanner;
public class Desafio03 {
	/*Voc� deve se lembrar que os tri�ngulos possuem uma regra para existirem: a soma de QUAI
	 * SQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, tamb�m, que os tri�ngulos podem ser de tr�s tipos: equil�teros, escalenos ou is�sceles.
Crie uma fun��o que valida se um tri�ngulo existe ou n�o. Al�m disso, crie uma fun��o que verifica o tipo do 
tri�ngulo (ela deve primeiro validar se o tri�ngulo existe).
A main do seu programa deve ter a leitura dos lados do tri�ngulo e a chamada da fun��o que retorna o tipo dele. 

	 * */
	
	public static boolean verificaTriangulo(int ladoA, int ladoB, int ladoC) {
	    if(ladoA == 0 || ladoB == 0 || ladoC ==0) {
	    	return false;
	    }else if((ladoA + ladoB > ladoC) || (ladoA + ladoC > ladoB) || (ladoB + ladoC > ladoA)){
			return true;
		}
		return false;
	}
	
	public static String tipoTriangulo(int ladoA, int ladoB, int ladoC){
		if(verificaTriangulo(ladoA, ladoB, ladoC)) {
			if(ladoA==ladoB && ladoA == ladoC) {
				return "Tri�ngulo equil�tero";
			}else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
				return "Tri�ngulo is�sceles";
			}else {
				return "Tri�ngulo escaleno";
			}
		}
		return "Os lados informados n�o formam tri�ngulo";
	}
	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int ladoA, ladoB, ladoC;
		System.out.println("Digite o Lado A: ");
		ladoA = leitor.nextInt();
		
		System.out.println("Digite o Lado B: ");
		ladoB = leitor.nextInt();
		
		System.out.println("Digite o Lado C: ");
		ladoC = leitor.nextInt();
		
		System.out.println(tipoTriangulo(ladoA, ladoB, ladoC));
		
		leitor.close();
		
		
	}
}
