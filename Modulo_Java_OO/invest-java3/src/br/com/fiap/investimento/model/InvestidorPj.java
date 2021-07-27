package br.com.fiap.investimento.model;

public class InvestidorPj extends Investidor{

	private String cnpj;

	public InvestidorPj() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InvestidorPj(String paramCnpj, int paramInvestidoId, String paramNome, double paramPatrimonio) {
		cnpj = paramCnpj;
		super.setInvestidoId(paramInvestidoId);
		super.setNome(paramNome);
		super.setPatrimonio(paramPatrimonio);
	}

	public InvestidorPj(int investidoId, String nome, double patrimonio) {
		super(investidoId, nome, patrimonio);
		// TODO Auto-generated constructor stub
	}

	public InvestidorPj(String nome, double patrimonio) {
		super(nome, patrimonio);
		// TODO Auto-generated constructor stub
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "InvestidorPj [getCnpj()=" + getCnpj() + ", getInvestidoId()=" + getInvestidoId() + ", getNome()="
				+ getNome() + ", getPatrimonio()=" + getPatrimonio() + ", getPerfilRisco()=" + getPerfilRisco()
				+ ", getDataAberturaConta()=" + getDataAberturaConta() + ", hashCode()=" + hashCode() + "]";
	}
	
}
