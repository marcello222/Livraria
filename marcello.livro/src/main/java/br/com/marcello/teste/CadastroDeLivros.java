package br.com.marcello.teste;

import br.com.marcello.livraria.Autor;
import br.com.marcello.livraria.Ebook;
import br.com.marcello.livraria.Livro;
import br.com.marcello.livraria.LivroFisico;

public class CadastroDeLivros {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("Rodrigo.turini@alura.com.br");
		autor.setCpf("123.434.455-5");

		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Pratico");
		livro.setDescricao("Novos recursos da Linguagem");
		livro.setValor(59.90);
		livro.aplicaDescontoDe(0.7);
		livro.setIsbn("978.85.64646-46-6");

		// chamando o metodo da classe Livro que mostra detalhes
		livro.mostrarDetalhes();

		Autor outroautor = new Autor();
		outroautor.setNome("Paulo Silveira");
		outroautor.setEmail("Silveira@alura.com.br");
		outroautor.setCpf("133.324.3335-5");

		Livro outroLivro = new Ebook(outroautor);
		outroLivro.setNome("Lógica de Programação");
		outroLivro.setDescricao("Crie seus primeiros programas");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978.87.92272-98-9");

		// chamando o metodo da classe Livro que mostra detalhes
		outroLivro.mostrarDetalhes();

		Livro LivroSemAutor = new LivroFisico(null);
		LivroSemAutor.setNome("Lógica de DevOps");
		LivroSemAutor.setDescricao("Crie seus Dev");
		LivroSemAutor.setValor(89.90);
		LivroSemAutor.setIsbn("978.87.923332-38-9");

		LivroSemAutor.mostrarDetalhes();

	}

}
