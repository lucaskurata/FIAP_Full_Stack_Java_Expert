package polimorfismoOverride;

public class Arara extends Ave{

	@Override
	public String toString() {
		return "Arara [" + (peso != null ? "peso=" + peso + ", " : "") + "idade=" + idade + ", membros=" + membros
				+ ", " + (getCorPena() != null ? "getCorPena()=" + getCorPena() : "") + "]";
	}

}
