import java.util.Scanner;
public class Desafio03 {
	/*Você deve se lembrar que os triângulos possuem uma regra para existirem: a soma de QUAI
	 * SQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, também, que os triângulos podem ser de três tipos: equiláteros, escalenos ou isósceles.
Crie uma função que valida se um triângulo existe ou não. Além disso, crie uma função que verifica o tipo do 
triângulo (ela deve primeiro validar se o triângulo existe).
A main do seu programa deve ter a leitura dos lados do triângulo e a chamada da função que retorna o tipo dele. 

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
				return "Triângulo equilátero";
			}else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
				return "Triângulo isósceles";
			}else {
				return "Triângulo escaleno";
			}
		}
		return "Os lados informados não formam triângulo";
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
