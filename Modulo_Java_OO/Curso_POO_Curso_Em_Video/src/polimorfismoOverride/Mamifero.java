package polimorfismoOverride;

public class Mamifero extends Animal{

	private String corPelo;
	
	protected String getCorPelo() {
		return corPelo;
	}

	protected void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		System.out.println("Correndo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de mamífero");
		
	}

	@Override
	public String toString() {
		return "Mamifero [corPelo=" + corPelo + ", peso=" + peso + ", idade=" + idade + ", membros=" + membros + "]";
	}	
		
}
