package polimorfismoOverride;

public class Cachorro extends Mamifero{

	public void enterrarOsso() {
		System.out.println("Enterrando o osso");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando o rabo");
	}

	@Override
	public String toString() {
		return "Cachorro [" + (peso != null ? "peso=" + peso + ", " : "") + "idade=" + idade + ", membros=" + membros
				+ ", " + (getCorPelo() != null ? "getCorPelo()=" + getCorPelo() : "") + "]";
	}	
	
}
