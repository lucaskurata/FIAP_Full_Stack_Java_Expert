package br.com.fiap.videolocadora.model;

import java.util.Date;

import br.com.fiap.videolocadora.util.DateUtils;

public class Cliente {
	
	private int id;
	private String nome;
	private String cpf;
	private String cartaoCredito;
	private Date dataNascimento;
	private int idade;

	public Cliente() {
		System.out.println("Executando o contrutor do Cliente");
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public Cliente(int id) {
		this.id = id;
	}

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Cliente(String nome, String cpf, String cartaoCredito) {
		this.nome = nome;
		this.cpf = cpf;
		this.cartaoCredito = cartaoCredito;
	}
	
	public Cliente(int id, String nome, String cpf, String cartaoCredito, Date dataNascimento, int idade) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cartaoCredito = cartaoCredito;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
	}

	public String getIniciaisNome() {
		// String retorno = pega a primeira letra do nome,
		// quebra o espaço
		// pega a primeira letra do segundo nome.
		return "FM";
	}

	public int getId() {
		return id;
	}

	public void setId(int identenficador) {
		id = identenficador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return DateUtils.calcularIdade(dataNascimento);
	}

	
	
	public void alugar() {
		System.out.println(
				"Aluguel do cliente " 
				+ nome +
				" efetuado com sucesso");
	}
	
	public boolean devolver(String filme){
		// consultar se filme está mesmo alugado para aquele cliente
		// verificar se o pagamento já foi efetuado
		// alterar o status do filme para livre
		// alterar a conta do cliente para sem débito.
		System.out.println("Devolvendo " + filme);
		return true;
	}
	
	public String pegarPrimeirosNumeroCartaoCredito(){
		String valor = cartaoCredito.substring(0,4);
		return valor;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", cartaoCredito=" + cartaoCredito
				+ ", dataNascimento=" + dataNascimento + ", idade=" + idade + "]";
	}

		
	
}
