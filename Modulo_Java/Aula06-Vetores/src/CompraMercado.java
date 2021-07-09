import java.util.Scanner;
public class CompraMercado {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Double vetCarrinhoValores[] = new Double[5];
		String vetCarrinhoNomes[] = new String[5];
		
		int opcao=0;
		
		System.out.println("Seja bem vindo ao mercado do Lucas Kurata: \n\n");
		while (opcao != 7) {
			System.out.println("\n1- Para cadastrar produtos e seus preços.");
			System.out.println("2- Para remover um produto através do seu nome.");
			System.out.println("3- Para calcular o valor total da compra.");
			System.out.println("4- Para exibir a quantidade de produtos comprados.");
			System.out.println("5- Para exibir o nome do produto de maior valor.");
			System.out.println("6- Para exibir o nome de cada produto ao lado de seu preço.");
			System.out.println("7- Para sair do sistema.");
			opcao = leitor.nextInt();
		
			switch(opcao){
			case 1: 
				int posicaoAtual=0;
				String nomeUpperCase;
				for(int i=0; i<vetCarrinhoValores.length; i++) {
					if(posicaoAtual==vetCarrinhoNomes.length) {
						System.out.println("Carrinho cheio");
					}else {
						System.out.println("Digite o nome do "+ (i+1) + "º produto");
						nomeUpperCase = leitor.next();
						vetCarrinhoNomes[i] = nomeUpperCase.substring(0,1).toUpperCase().concat(nomeUpperCase.substring(1)); 
						System.out.println("Digite o preço do "+ (i+1) + "º produto");
						vetCarrinhoValores[i] = leitor.nextDouble();
						posicaoAtual++;
					}		
				}
				
				break;
				
			case 2:
				String deletaProduto;
				System.out.println("Digite o nome do produto que deseja remover dentre as seguinte opções: ");
//				System.out.println(vetCarrinhoNomes);
				deletaProduto = leitor.next();
				
				for(int i = 0; i < vetCarrinhoValores.length; i++) {
					if(vetCarrinhoNomes[i].equalsIgnoreCase(deletaProduto)){
						System.out.println("O produto " + vetCarrinhoNomes[i].toUpperCase() + " foi deletado com sucesso");
						vetCarrinhoNomes[i] = "";
						vetCarrinhoValores[i] = 00.00;
					}
				}				
				break;
				
			case 3:
				double totalCompras=0;
				for(int i = 0; i<vetCarrinhoValores.length; i++) {
					totalCompras += vetCarrinhoValores[i];
				}
				System.out.println("O valor total da compra foi de: R$" + totalCompras);
				break;
				
			case 4:
				int qtdItensComprados=0;
				for(int i = 0; i<vetCarrinhoValores.length; i++) {
					if(!vetCarrinhoValores[i].equals(00.00)) {
						qtdItensComprados += 1;
					}
				}
				
				System.out.println("A quantidade total de produtos foi de: " + qtdItensComprados);
				break;
				
			case 5:
				double maiorValor=0;
				int posicao = 0;
				for(int i = 0; i<vetCarrinhoValores.length; i++) {
					if(vetCarrinhoValores[i] > maiorValor) {
						maiorValor = vetCarrinhoValores[i];
						posicao = i;
					}
				}
				
				System.out.println("O maior valor do carrinho é do produto " + vetCarrinhoNomes[posicao] + " de valor R$" + maiorValor);
				break;
				
			case 6:
				System.out.println("Segue a lista dos produtos e seus preços: ");
				for (int i = 0; i < vetCarrinhoValores.length; i++) {
					if(!vetCarrinhoNomes[i].equals("") && !vetCarrinhoValores[i].equals(00.00)) {
						System.out.println("Produto: " + vetCarrinhoNomes[i] + " R$" + vetCarrinhoValores[i]);
					}	
				}
			
				break;
				
			case 7:
				System.out.println("Saindo do sistema!");
				break;
				
			default:
				System.out.println("Opção inválida, tente novamente!");
				break;
			}
		}
		
		leitor.close();
	}

}
