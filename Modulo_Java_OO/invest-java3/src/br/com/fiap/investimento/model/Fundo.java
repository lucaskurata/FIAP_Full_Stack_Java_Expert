package br.com.fiap.investimento.model;

public class Fundo {

	private int fundoId;
	private String nomeFundo;
	private boolean ehAberto;
	
	
	public Fundo() {
		
	}
	
	public Fundo(int fundoId, String nomeFundo) {
		super();
		this.fundoId = fundoId;
		this.nomeFundo = nomeFundo;
	}
	
	public Fundo(int fundoId, String nomeFundo, boolean ehAberto) {
		super();
		this.fundoId = fundoId;
		this.nomeFundo = nomeFundo;
		this.ehAberto = ehAberto;
	}
	
	
	
	
	public int getFundoId() {
		return fundoId;
	}
	public void setFundoId(int fundoId) {
		this.fundoId = fundoId;
	}
	public String getNomeFundo() {
		return nomeFundo;
	}
	public void setNomeFundo(String nomeFundo) {
		this.nomeFundo = nomeFundo;
	}

	public boolean isEhAberto() {
		return ehAberto;
	}

	public void setEhAberto(boolean ehAberto) {
		this.ehAberto = ehAberto;
	}

	@Override
	public String toString() {
		return "Fundo [fundoId=" + fundoId + ", nomeFundo=" + nomeFundo + ", ehAberto=" + ehAberto + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
