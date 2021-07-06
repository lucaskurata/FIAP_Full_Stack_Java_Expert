import java.util.Random;
public class GeraNumeroAleatorio {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int numero[] = new int[10];
		
		int qtdNumerosTresSete= 0 ,  qtdPares = 0, qtdMenoresTres = 0, qtdImpares = 0;
		
		for(int i=0; i<numero.length; i++) {
			numero[i] = aleatorio.nextInt(10);
			
			if (numero[i] >= 3 && numero[i] <= 7){
				qtdNumerosTresSete = qtdNumerosTresSete + 1;
			}
			if (numero[i]%2 == 0) {
				qtdPares+=1;
			}
			if (numero[i]<3) {
				qtdMenoresTres+=1;
			}
			if(numero[i]%2 > 0) {
				qtdImpares+=1;
			}
			
		}
		
		System.out.println("A quantidade de números entre 3 e 7: " + qtdNumerosTresSete);
		System.out.println("Quantidade de números pares: " + qtdPares);
		System.out.println("A quantidade de números menores que 3: " + qtdMenoresTres);
		System.out.println("Quantidade de números ímpares: " + qtdImpares);
		
		System.out.println("----------------------------------------------------");
		for(int i=0; i<numero.length; i++) {
			System.out.println("Lista dos vetores: " + numero[i]);
		}
		
	}

}
