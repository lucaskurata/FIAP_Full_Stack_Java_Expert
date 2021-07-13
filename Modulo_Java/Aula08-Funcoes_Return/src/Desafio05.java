import java.util.Scanner;
public class Desafio05 {
/*A rede de supermercados MercaJava está levando a sério as restrições de isolamento social no Brasil. 
 * Estão trabalhando para automatizar as portas das unidades, permitindo a entrada apenas das pessoas 
 * que estão atendendo às solicitações.
Toda a identificação das medidas necessárias é feita através de câmeras e sensores de temperaturas. 
Sua tarefa é criar as funções que recebam essas medidas e informem se o cliente pode ou não entrar no
estabelecimento.
As funções são:
•	Temperatura: Clientes com temperatura superior a 37,0 graus não podem entrar no estabelecimento.
•	Máscara: Clientes sem máscara não podem entrar no estabelecimento.
•	Famílias: grupos com mais de 2 pessoas não podem entrar no estabelecimento.
•	Função agregadora: só autoriza a entrada no estabelecimento de clientes que cumprirem com as 
3 funções anteriores.
*/
	
	public static boolean validaTemperatura(double temperatura) {
		if(temperatura < 37.0) {
			return true;
		}
		return false;
	}
	
	public static boolean verificaMascara(String mascara) {
		if(mascara.equalsIgnoreCase("Sim") || mascara.equalsIgnoreCase("S")) {
			return true;
		}
		return false;
	}
	
	public static boolean qtdPessoas(int quantidade) {
		if(quantidade <= 2) {
			return true;
		}
		return false;
	}
	
	public static String verificaSeguranca(int quantidade, String mascara, double temperatura) {
		if(qtdPessoas(quantidade) && verificaMascara(mascara) && validaTemperatura(temperatura)) {
			return "Acesso liberado, medidas sanitárias cumpridas!";
		}
		return "Acesso negado, medidas sanitárias não cumpridas!";
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int quantidade;
		String mascara;
		double temperatura;
		
		System.out.println("Digite a quantidade de pessoas que irão entrar no estabelecimento: ");
		quantidade = leitor.nextInt();
		
		System.out.println("A pessoa está de máscara? \n'S' ou 'SIM' para confirmar ");
		mascara = leitor.next();
		
		System.out.println("Digite a temperatura da pessoa: ");
		temperatura = leitor.nextDouble();
		
		System.out.println(verificaSeguranca(quantidade, mascara, temperatura));
		
		leitor.close();

	}

}
