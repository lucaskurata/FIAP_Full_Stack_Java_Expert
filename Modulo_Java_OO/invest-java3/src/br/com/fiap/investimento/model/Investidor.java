package br.com.fiap.investimento.model;

import java.util.Date;

public abstract class Investidor {
	
	private int investidoId;
	private String nome;
	private double patrimonio;
	private String perfilRisco;
	private Date dataAberturaConta;
	
	public Investidor() {
		super();
	}
	
	public Investidor(String nome, double patrimonio) {
		super();
		this.nome = nome;
		this.patrimonio = patrimonio;
	}

	public Investidor(int investidoId, String nome, double patrimonio) {
		super();
		this.investidoId = investidoId;
		this.nome = nome;
		this.patrimonio = patrimonio;
	}

	public int getInvestidoId() {
		return investidoId;
	}

	public void setInvestidoId(int investidoId) {
		this.investidoId = investidoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(double patrimonio) {
		this.patrimonio = patrimonio;
	}

	public String getPerfilRisco() {
		return perfilRisco;
	}

	public void setPerfilRisco(String perfilRisco) {
		this.perfilRisco = perfilRisco;
	}

	public Date getDataAberturaConta() {
		return dataAberturaConta;
	}

	public void setDataAberturaConta(Date dataAberturaConta) {
		this.dataAberturaConta = dataAberturaConta;
	}
	
}
