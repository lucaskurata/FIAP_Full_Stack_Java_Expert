package polimorfismoOverride;

public abstract class Animal {

	protected Double peso;
	protected int idade;
	protected int membros;
	
	protected Double getPeso() {
		return peso;
	}

	protected void setPeso(Double peso) {
		this.peso = peso;
	}

	protected int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}

	protected int getMembros() {
		return membros;
	}

	protected void setMembros(int membros) {
		this.membros = membros;
	}

	public abstract void locomover();
	
	public abstract void alimentar();
	
	public abstract void emitirSom();
	
}
