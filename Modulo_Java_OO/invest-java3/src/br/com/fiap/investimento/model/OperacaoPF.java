package br.com.fiap.investimento.model;

import java.util.Date;

public class OperacaoPF {

	private int operacaoId;
	private Fundo fundo;
	private InvestidorPF investidorPF;
	private double valor;
	private Date dataOperacao;
	
	
	public OperacaoPF() {
		super();
	}

	public OperacaoPF(Fundo fundo, InvestidorPF investidorPF, double valor, Date dataOperacao) {
		super();
		this.fundo = fundo;
		this.investidorPF = investidorPF;
		this.valor = valor;
		this.dataOperacao = dataOperacao;
	}

	
	public OperacaoPF(int operacaoId, Fundo fundo, InvestidorPF investidorPF, double valor, Date dataOperacao) {
		super();
		this.operacaoId = operacaoId;
		this.fundo = fundo;
		this.investidorPF = investidorPF;
		this.valor = valor;
		this.dataOperacao = dataOperacao;
	}




	public int getOperacaoId() {
		return operacaoId;
	}
	public void setOperacaoId(int operacaoId) {
		this.operacaoId = operacaoId;
	}
	public Fundo getFundo() {
		return fundo;
	}
	public void setFundo(Fundo fundo) {
		this.fundo = fundo;
	}
	public InvestidorPF getInvestidorPF() {
		return investidorPF;
	}
	public void setInvestidorPF(InvestidorPF investidorPF) {
		this.investidorPF = investidorPF;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getDataOperacao() {
		return dataOperacao;
	}
	public void setDataOperacao(Date dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

	

	@Override
	public String toString() {
		return "OperacaoPF [operacaoId=" + operacaoId + ", fundo=" + fundo + ", investidorPF=" + investidorPF
				+ ", valor=" + valor + ", dataOperacao=" + dataOperacao + "]";
	}

	
	
	
	
	
	
	
	
}
