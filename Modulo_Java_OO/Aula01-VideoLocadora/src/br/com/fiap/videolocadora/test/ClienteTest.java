package br.com.fiap.videolocadora.test;

import java.util.Date;
import br.com.fiap.videolocadora.model.Cliente;

public class ClienteTest {

	// Tela Fake
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.setNome("Lucas Kurata");
		c1.setDataNascimento(new Date());
//		c1.id = 1;
//		c1.nome = "Lucas Kurata";
//		c1.cpf = "508.851.688-60";
//		c1.cartaoCredito = "123456789";
//		c1.dataNascimento = new Date();
//		c1.idade = 21;
		
		System.out.println(c1.getNome());
		System.out.println(c1.getIdade());
		
//		System.out.println(c1);
//		
//		c1.alugar();
//		
//		String cartaoNumeroReduzido = c1.pegarPrimeirosNumerosCartaoCredito();
//		System.out.println(cartaoNumeroReduzido);
//		
//		String nomeFilme = "Rampage";
//		boolean foiDevolvido = c1.devolver(nomeFilme);
//		if (foiDevolvido == true) {
//			System.out.println("Sucesso");
//		}else {
//			System.out.println("Deu erro");
//		}
		
		Cliente c2; 
		c2 = new Cliente();
//		c2.id = 2;
//		c2.nome = "Henrique Kurata";
//		c2.cpf = "302.526.124-00";
//		c2.cartaoCredito = "987654321";
//		c2.dataNascimento = new Date();
		
//		System.out.println(c2);
		
	}

}
