package br.com.fiap.investimento.model;

public class InvestidorPJ extends Investidor {

	private String cpnj;

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}

	@Override
	public String toString() {
		return "InvestidorPJ [getCpnj()=" + getCpnj() + ", getInvestidorId()=" + getInvestidorId() + ", getNome()="
				+ getNome() + ", getPatrimonio()=" + getPatrimonio() + ", getPerfilRisco()=" + getPerfilRisco()
				+ ", getDataAberturaConta()=" + getDataAberturaConta() + "]";
	}
	
	
	
}
