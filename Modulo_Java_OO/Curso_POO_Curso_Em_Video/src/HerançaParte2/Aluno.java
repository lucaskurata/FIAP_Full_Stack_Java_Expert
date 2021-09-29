package HerançaParte2;

public class Aluno extends Pessoa{
	
	private int matricula;
	private String curso;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void pagarMensalidade() {
		System.out.println("Pagamento realizado com sucesso!" +  this.nome);
	}
	
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", curso=" + curso + ", nome=" + nome + ", idade=" + idade + ", sexo="
				+ sexo + ", getMatricula()=" + getMatricula() + ", getCurso()=" + getCurso() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
