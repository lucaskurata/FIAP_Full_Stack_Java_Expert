package br.com.fiap.videolocadora.model;

import java.util.Date;

public class Locacao {

	private int idLocacao;
	private Date dataLocacao;
	private Date prazoEntrega;
	
	private Cliente cliente;
	private Filme filme;
	
	private String filmeAlugado;
	private int quantidade;
	private Double valorTotal;
	
	public Locacao() {
		super();
	}
	
	public int getIdLocacao() {
		return idLocacao;
	}
	public void setIdLocacao(int idLocacao) {
		this.idLocacao = idLocacao;
	}
	public Date getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public Date getPrazoEntrega() {
		return prazoEntrega;
	}
	public void setPrazoEntrega(Date prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public String getFilmeAlugado() {
		return filmeAlugado;
	}
	public void setFilmeAlugado(String filmeAlugado) {
		this.filmeAlugado = filmeAlugado;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "Locacao [idLocacao=" + idLocacao + ", dataLocacao=" + dataLocacao + ", prazoEntrega=" + prazoEntrega
				+ ", cliente=" + cliente + ", filme=" + filme + ", filmeAlugado=" + filmeAlugado + ", quantidade="
				+ quantidade + ", valorTotal=" + valorTotal + "]";
	}
		
}
