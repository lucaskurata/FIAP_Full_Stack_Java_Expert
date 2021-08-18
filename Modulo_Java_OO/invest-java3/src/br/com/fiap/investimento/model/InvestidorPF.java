package br.com.fiap.investimento.model;

public class InvestidorPF extends Investidor implements Comparable<InvestidorPF> {

	private String cpf;
	private boolean ehAtivo;

	public InvestidorPF() {
		super();
	}

	public InvestidorPF(String paramCpf, String paramNome, double paramPatrimonio) {
		cpf = paramCpf;
		super.setNome(paramNome);
		super.setPatrimonio(paramPatrimonio);
	}
	
	public InvestidorPF(int investidorId, String nome) {
		super(investidorId, nome, 0.0);
	}
	
	public InvestidorPF(int investidorId, String nome, boolean ehAtivo) {
		super(investidorId, nome, 0.0);
		this.ehAtivo = ehAtivo;
	}
	
	public InvestidorPF(int investidorId, String nome, double patrimonio) {
		super(investidorId, nome, patrimonio);
	}

	public InvestidorPF(String nome, double patrimonio) {
		super(nome, patrimonio);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isEhAtivo() {
		return ehAtivo;
	}

	public void setEhAtivo(boolean ehAtivo) {
		this.ehAtivo = ehAtivo;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean retorno = true;
		
		if ( obj instanceof InvestidorPF ) {
			InvestidorPF investidorComparacao = (InvestidorPF) obj;
			
			if ( ! this.getNome().equals(investidorComparacao.getNome()) ) {
				retorno = false;
			}
			
			if ( this.getPatrimonio() != investidorComparacao.getPatrimonio() ) {
				retorno = false;
			}
			
			
		} else {
			retorno = false;
		}
			
		return retorno;
	}
	
	
	@Override
	public int hashCode() {
		return this.getInvestidorId();
	}

	@Override
	public int compareTo(InvestidorPF o) {
		int retorno = 0;
		
		if ( this.getNome().equals( o.getNome()) ) {
			retorno = Double.compare(this.getPatrimonio(), o.getPatrimonio());
		} else {
			retorno = this.getNome().compareTo(o.getNome());
		}
		
		return retorno;
	}

	
	@Override
	public String toString() {
		return "InvestidorPF [cpf=" + cpf + ", ehAtivo=" + ehAtivo + ", getInvestidorId()=" + getInvestidorId()
				+ ", getNome()=" + getNome() + ", getPatrimonio()=" + getPatrimonio() + "]";
	}

	
	
	
	
}

