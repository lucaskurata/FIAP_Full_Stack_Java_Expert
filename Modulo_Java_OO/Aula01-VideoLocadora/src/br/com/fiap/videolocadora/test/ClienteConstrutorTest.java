package br.com.fiap.videolocadora.test;

import java.util.Date;

import br.com.fiap.videolocadora.model.Cliente;
import br.com.fiap.videolocadora.util.DateUtils;

public class ClienteConstrutorTest {

	public static void main(String[] args) {
		
		// digitou todos na tela
		Cliente c1 = new Cliente();
		c1.setId(1);
		c1.setNome("Lucas Kurata");
		c1.setCpf("508.851.688-60");
		c1.setCartaoCredito("9999-9999-9999-9999");
		c1.setDataNascimento(new Date());
		System.out.println(c1);
		
		Cliente c2 = new Cliente("Flávio", "999");
		System.out.println(c2);
		
		Cliente c3 = new Cliente(1);
		System.out.println(c3);
		
		Cliente c4 = new Cliente("Lucas");
		c4.setDataNascimento(DateUtils.stringToDate("23/06/2000"));
		System.out.println(c4);
		
	}

}
