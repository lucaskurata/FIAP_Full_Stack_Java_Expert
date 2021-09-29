package polimorfismoOverride;

public class GoldFish extends Peixe{

	@Override
	public String toString() {
		return "GoldFish [" + (peso != null ? "peso=" + peso + ", " : "") + "idade=" + idade + ", membros=" + membros
				+ ", " + (getCorEscama() != null ? "getCorEscama()=" + getCorEscama() : "") + "]";
	}
	
}
