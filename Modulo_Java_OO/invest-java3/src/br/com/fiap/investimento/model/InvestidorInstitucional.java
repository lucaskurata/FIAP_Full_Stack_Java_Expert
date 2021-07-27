package br.com.fiap.investimento.model;

public class InvestidorInstitucional extends InvestidorPj{

	private String nomeResponsavelLegal;

	public InvestidorInstitucional() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvestidorInstitucional(int investidoId, String nome, double patrimonio) {
		super(investidoId, nome, patrimonio);
		// TODO Auto-generated constructor stub
	}

	public InvestidorInstitucional(String nome, double patrimonio) {
		super(nome, patrimonio);
		// TODO Auto-generated constructor stub
	}

	public String getNomeResponsavelLegal() {
		return nomeResponsavelLegal;
	}

	public void setNomeResponsavelLegal(String nomeResponsavelLegal) {
		this.nomeResponsavelLegal = nomeResponsavelLegal;
	}

	@Override
	public String toString() {
		return "InvestidorInstitucional [getNomeResponsavelLegal()=" + getNomeResponsavelLegal() + ", getCnpj()="
				+ getCnpj() + ", getInvestidoId()=" + getInvestidoId() + ", getNome()=" + getNome()
				+ ", getPatrimonio()=" + getPatrimonio() + ", getPerfilRisco()=" + getPerfilRisco()
				+ ", getDataAberturaConta()=" + getDataAberturaConta() + "]";
	}
		
}
