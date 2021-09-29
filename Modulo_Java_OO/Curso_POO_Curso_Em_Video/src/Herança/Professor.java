package Herança;

public class Professor extends Pessoa{

	private String especialidade;
	private Double salario;
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
		
	public void receberAumento(Double aumento) {
		 this.setSalario(this.getSalario()+aumento);
	}
	
}
