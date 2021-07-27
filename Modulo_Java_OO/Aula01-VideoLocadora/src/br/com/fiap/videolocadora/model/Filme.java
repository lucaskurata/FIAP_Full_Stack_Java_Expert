package br.com.fiap.videolocadora.model;

public class Filme {

	private int idFilme;
	private String nome;
	private int anoLancamento;
	private String diretor;
	private String descricao;
	private String genero;
	private int duracaoMinutos;
	
	public Filme() {
		super();
	}
	
	public Filme(String nome, int anoLancamento, String diretor) {
		super();
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.diretor = diretor;
	}

	public int getIdFilme() {
		return idFilme;
	}
	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracaoMinutos() {
		return duracaoMinutos;
	}
	public void setDuracaoMinutos(int duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}

	@Override
	public String toString() {
		return "Filme [idFilme=" + idFilme + ", nome=" + nome + ", anoLancamento=" + anoLancamento + ", diretor="
				+ diretor + ", descricao=" + descricao + ", genero=" + genero + ", duracaoMinutos=" + duracaoMinutos
				+ "]";
	}
				
}
