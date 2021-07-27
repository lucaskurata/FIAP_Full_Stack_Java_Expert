package br.com.fiap.investimento.model;

public class InvestidorPF extends Investidor{

	private String cpf;

	public InvestidorPF() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InvestidorPF(String paramCpf, String paramNome, double paramPatrimonio) {
		cpf = paramCpf;
		super.setNome(paramNome);
		super.setPatrimonio(paramPatrimonio);
	}

	public InvestidorPF(int investidoId, String nome, double patrimonio) {
		super(investidoId, nome, patrimonio);
		// TODO Auto-generated constructor stub
	}

	public InvestidorPF(String nome, double patrimonio) {
		super(nome, patrimonio);
		// TODO Auto-generated constructor stub
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "InvestidorPF [getCpf()=" + getCpf() + ", getInvestidoId()=" + getInvestidoId() + ", getNome()="
				+ getNome() + ", getPatrimonio()=" + getPatrimonio() + ", getPerfilRisco()=" + getPerfilRisco()
				+ ", getDataAberturaConta()=" + getDataAberturaConta() + "]";
	}
	
}
