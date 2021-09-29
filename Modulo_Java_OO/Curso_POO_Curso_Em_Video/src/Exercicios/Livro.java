package Exercicios;

public class Livro implements Publicacao{
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private Boolean aberto;
	private Pessoa leitor;
	
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public Boolean getAberto() {
		return aberto;
	}

	public void setAberto(Boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	public String detalhes() {
		return "Livro: " + "\ntitulo= " + titulo + ",\nautor= " + autor + ",\ntotPaginas= " + totPaginas + ",\npagAtual= " + pagAtual
				+ ",\naberto= " + aberto + ",\nleitor= " + leitor.getNome() + ",\nIdade= " + leitor.getIdade() + ",\nSexo= " + leitor.getSexo() + "\n";
	}

	@Override
	public void abrir() {
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		this.setAberto(false);
	}

	@Override
	public void folhear(int pagina) {
		if(pagina >= 0 && pagina <= this.getTotPaginas()){
			this.setPagAtual(pagina);			
		}else {		
			System.out.println("Não é possível ir para a página: " + pagina);
		}
		
	}

	@Override
	public void avancarPagina() {
		if(this.getPagAtual() >= 0 && this.getPagAtual() < this.getTotPaginas() && this.getAberto()) {
			this.setPagAtual(this.getPagAtual() + 1);
		}else {		
			System.out.println("Não é possível avançar uma página");
		}
	}

	@Override
	public void voltarPagina() {
		if(this.getPagAtual() > 0 && this.getPagAtual() <= this.getTotPaginas() && this.getAberto()) {
			this.setPagAtual(this.getPagAtual() -1);			
		}else {		
			System.out.println("Não é possível voltar uma página");
		}
		
	}
	
}
