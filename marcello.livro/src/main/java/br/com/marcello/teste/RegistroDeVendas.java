package br.com.marcello.teste;

import br.com.marcello.livraria.Autor;
import br.com.marcello.livraria.Ebook;
import br.com.marcello.livraria.LivroFisico;

public class RegistroDeVendas {

	public static void main(String[] args) {
	
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total " + carrinho.getTotal());
		
		if (fisico.aplicaDescontoDe10Porcento()) {
			System.out.println("Valor agora é: " + fisico.getValor());
		}

		
	}

}
