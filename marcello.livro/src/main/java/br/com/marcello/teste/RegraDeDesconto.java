package br.com.marcello.teste;

import br.com.marcello.livraria.Autor;
import br.com.marcello.livraria.Ebook;
import br.com.marcello.livraria.Livro;
import br.com.marcello.livraria.MiniLivro;

public class RegraDeDesconto {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");

		Livro livro = new MiniLivro(autor);
		livro.setValor(59.90);

		if (!livro.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto não pode ser maior do que 30%");
		} else {
			System.out.println("Valor do livro com desconto: " + livro.getValor());
		}

		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);

		if (!ebook.aplicaDescontoDe(0.15)) {
			System.out.println("Desconto no ebook não pode ser maior que 15%");
		} else {
			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
		}

	}

}