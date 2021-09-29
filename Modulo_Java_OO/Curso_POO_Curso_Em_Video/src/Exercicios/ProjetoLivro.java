package Exercicios;

public class ProjetoLivro {

	public static void main(String[] args) {

		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Lucas Kurata", 21, "Masculino");
		p[1] = new Pessoa("Fulana", 25, "Feminino");	
		
		l[0] = new Livro("A ilha perdida", "Maria José Dupré", 127, p[0]);
		l[1] = new Livro("Diário de um Banana", "Jeff Kinney", 221, p[1]);
		l[2] = new Livro("Diário de um Banana: Dias de Cão", "Maria José Dupré", 217, p[1]);
		
		l[0].abrir();
        l[0].avancarPagina();
        l[0].avancarPagina();
        l[0].voltarPagina();
        l[0].folhear(127);
        
        l[1].abrir();
        l[1].fechar();
        
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
		System.out.println(l[2].detalhes());
		
	}

}
