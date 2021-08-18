package br.com.fiap.investimento.model;

import java.util.Date;

public abstract class Investidor {

	private int investidorId;
	private String nome;
	private double patrimonio;
	private String perfilRisco;
	private Date dataAberturaConta;
	

	public Investidor() {
	}

	public Investidor(String nome, double patrimonio) {
		super();
		this.nome = nome;
		this.patrimonio = patrimonio;
	}

	public Investidor(int investidorId, String nome, double patrimonio) {
		super();
		this.investidorId = investidorId;
		this.nome = nome;
		this.patrimonio = patrimonio;
	}

	public int getInvestidorId() {
		return investidorId;
	}

	public void setInvestidorId(int investidorId) {
		this.investidorId = investidorId;
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

	@Override
	public String toString() {
		return "Investidor [investidorId=" + investidorId + ", nome=" + nome + ", patrimonio=" + patrimonio
				+ ", perfilRisco=" + perfilRisco + ", dataAberturaConta=" + dataAberturaConta + "]";
	}
	
	
	
	
}
