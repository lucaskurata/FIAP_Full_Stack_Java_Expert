package polimorfismoOverlay;

public abstract class Animal {

	protected Double peso;
	protected int idade;
	protected int membros;
	
	public abstract void emitirSom();

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

	@Override
	public String toString() {
		return "Animal [" + (peso != null ? "peso=" + peso + ", " : "") + "idade=" + idade + ", membros=" + membros
				+ "]";
	}
	
}
