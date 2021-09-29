package AgregaçãoEntreObjetos;

public class Lutador {

	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private Double altura, peso;
		
	public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, Double altura,
			Double peso) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.altura = altura;
		this.setPeso(peso);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() { 
		if(this.getPeso()<52.2) {
			this.categoria = "Inválido";
		}else if(this.getPeso() < 70.3) {
			this.categoria = "Leve";
		}else if(this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		}else if(this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
	}

	public void apresentar() {
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println(this.getIdade() + " anos");
		System.out.println(this.getAltura() + " Altura");
		System.out.println("Pesando: " + this.getPeso() + "kg");
		System.out.println("Ganhou: " + this.getVitorias());
		System.out.println("Empatou: " + this.getEmpates());
		System.out.println("Perdeu" + this.getDerrotas());
	}
	
	public void status() {
		System.out.println(this.getNome());
		System.out.println("É um peso: " + this.getCategoria());
		System.out.println(this.getVitorias() + " Vitórias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println(this.getEmpates() + " Empates");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
}
