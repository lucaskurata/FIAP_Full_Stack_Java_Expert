package polimorfismoOverride;

public class Tartaruga extends Reptil{

	@Override
	public void locomover() {
		System.out.println("Tartaruga andando");
	}

	@Override
	public String toString() {
		return "Tartaruga [" + (peso != null ? "peso=" + peso + ", " : "") + "idade=" + idade + ", membros=" + membros
				+ ", " + (getCorEscama() != null ? "getCorEscama()=" + getCorEscama() : "") + "]";
	}
	
}
