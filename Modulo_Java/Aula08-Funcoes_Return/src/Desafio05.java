import java.util.Scanner;
public class Desafio05 {
/*A rede de supermercados MercaJava est� levando a s�rio as restri��es de isolamento social no Brasil. 
 * Est�o trabalhando para automatizar as portas das unidades, permitindo a entrada apenas das pessoas 
 * que est�o atendendo �s solicita��es.
Toda a identifica��o das medidas necess�rias � feita atrav�s de c�meras e sensores de temperaturas. 
Sua tarefa � criar as fun��es que recebam essas medidas e informem se o cliente pode ou n�o entrar no
estabelecimento.
As fun��es s�o:
�	Temperatura: Clientes com temperatura superior a 37,0 graus n�o podem entrar no estabelecimento.
�	M�scara: Clientes sem m�scara n�o podem entrar no estabelecimento.
�	Fam�lias: grupos com mais de 2 pessoas n�o podem entrar no estabelecimento.
�	Fun��o agregadora: s� autoriza a entrada no estabelecimento de clientes que cumprirem com as 
3 fun��es anteriores.
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
			return "Acesso liberado, medidas sanit�rias cumpridas!";
		}
		return "Acesso negado, medidas sanit�rias n�o cumpridas!";
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int quantidade;
		String mascara;
		double temperatura;
		
		System.out.println("Digite a quantidade de pessoas que ir�o entrar no estabelecimento: ");
		quantidade = leitor.nextInt();
		
		System.out.println("A pessoa est� de m�scara? \n'S' ou 'SIM' para confirmar ");
		mascara = leitor.next();
		
		System.out.println("Digite a temperatura da pessoa: ");
		temperatura = leitor.nextDouble();
		
		System.out.println(verificaSeguranca(quantidade, mascara, temperatura));
		
		leitor.close();

	}

}
