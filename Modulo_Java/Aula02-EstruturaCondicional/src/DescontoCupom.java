import java.util.Scanner;

public class DescontoCupom {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double valor;
		System.out.println("Digite o valor da compra: ");
		valor = leitor.nextDouble();
		
		String cupom;
		System.out.println("Digite o cupom para aplica��o do desconto caso v�lido: ");
        cupom = leitor.next();
		
        double valorComDesconto;
        
		if (cupom.equalsIgnoreCase("DIADEFESTA")) {
			valorComDesconto = valor * 0.97;
			System.out.println("O cupom foi aplicado com sucesso... Valor a ser pago: R$" + valorComDesconto);
		}else {
			System.out.println("O cupom � inv�lido... Valor a ser pago: R$" + valor);
		}

	}

}
