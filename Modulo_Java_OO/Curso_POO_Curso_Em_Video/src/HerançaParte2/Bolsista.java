package HerançaParte2;

public class Bolsista extends Aluno{

	private Double bolsa;

	public Double getBolsa() {
		return bolsa;
	}

	public void setBolsa(Double bolsa) {
		this.bolsa = bolsa;
	}
	
	public void renovarBolsa() {
		System.out.println("Renovando a bolsa do aluno: " + this.nome);
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println("Pagamento bolsista realizado com sucesso!" +  this.nome);
	}

	@Override
	public String toString() {
		return "Bolsista [bolsa=" + bolsa + ", nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", getBolsa()="
				+ getBolsa() + ", getMatricula()=" + getMatricula() + ", getCurso()=" + getCurso() + "]";
	}
	
}
