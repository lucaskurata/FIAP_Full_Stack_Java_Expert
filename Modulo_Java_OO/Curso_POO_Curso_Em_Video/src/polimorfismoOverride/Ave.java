package polimorfismoOverride;

public class Ave extends Animal{

	private String corPena;
	
	protected String getCorPena() {
		return corPena;
	}

	protected void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public void locomover() {
		System.out.println("Voando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
		
	}
	
	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}

	@Override
	public String toString() {
		return "Ave [corPena=" + corPena + ", peso=" + peso + ", idade=" + idade + ", membros=" + membros + "]";
	}

}
