package polimorfismoOverlay;

public class Mamifero extends Animal{

	protected String corPelo;	
	
	protected String getCorPelo() {
		return corPelo;
	}

	protected void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de M amífero");
		
	}

	@Override
	public String toString() {
		return "Mamifero [" + (corPelo != null ? "corPelo=" + corPelo + ", " : "")
				+ (peso != null ? "peso=" + peso + ", " : "") + "idade=" + idade + ", membros=" + membros + "]";
	}
	
}
