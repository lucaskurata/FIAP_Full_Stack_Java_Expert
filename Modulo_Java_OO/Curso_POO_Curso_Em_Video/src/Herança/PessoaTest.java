package Herança;

public class PessoaTest {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Lucas Kurata");
		p1.setIdade(21);
		p1.setSexo("M");
		
		p2.setNome("Henrique");
		p3.setNome("Rodrigo");
		p4.setNome("Thiago");
		
		p2.setCurso("Análise e Desenvolvimento de sistemas");
		p3.setSalario(3785.00);
		p4.setSetor("Refeitório");
		
		p2.cancelarMatricula();
		p3.receberAumento(150.00);
		p4.mudarTrabalho();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}

}
