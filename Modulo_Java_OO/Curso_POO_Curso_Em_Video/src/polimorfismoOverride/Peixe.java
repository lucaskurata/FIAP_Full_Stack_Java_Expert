package polimorfismoOverride;

public class Peixe extends Animal{

	private String corEscama;
			
	protected String getCorEscama() {
		return corEscama;
	}

	protected void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
		
	}
	
	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}

	@Override
	public String toString() {
		return "Peixe [corEscama=" + corEscama + ", peso=" + peso + ", idade=" + idade + ", membros=" + membros + "]";
	}
	
}
