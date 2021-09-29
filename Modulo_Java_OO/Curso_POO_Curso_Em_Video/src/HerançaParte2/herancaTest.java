package HerançaParte2;

public class herancaTest {

	public static void main(String[] args) {
		
		Visitante v1 = new Visitante();
		System.out.println("Visitante: ");
		v1.nome="Lucas Kurata";
		v1.idade=21;
		v1.sexo="M";
		System.out.println(v1.toString());
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		System.out.println("Aluno: ");
		Aluno a1 = new Aluno();
		a1.nome="Lucas Kurata";
		a1.idade=21;
		a1.sexo="M";
		a1.setMatricula(1800794);
		a1.setCurso("Análise e Desenvolvimento de sistemas");
		a1.pagarMensalidade();
		System.out.println(a1.toString());
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		System.out.println("Bolsista: ");
		Bolsista b1 = new Bolsista();
		b1.nome="Lucas Kurata";
		b1.idade=21;
		b1.sexo="M";
		b1.setMatricula(1800794);
		b1.setCurso("Análise e Desenvolvimento de sistemas");
		b1.pagarMensalidade();
		b1.setBolsa(500.36);
		b1.renovarBolsa();
		System.out.println(b1.toString());
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

	}

}
