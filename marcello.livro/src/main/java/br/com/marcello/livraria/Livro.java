package br.com.marcello.livraria;

import br.com.marcello.produtos.Produto;

public abstract class Livro implements Produto {

	private String nome;
	private String descricao;
	private Double valor;
	private String isbn;
	private Autor autor;
	private boolean impresso;

	//Contrutor para chamar o autor
	public Livro(Autor autor) {
		
		// throw para caso o autor seja null
		if(autor == null) {
			throw new RuntimeException("O autor do Lvrio não pode ser nulo");
		}
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}

	// Construtor para chamar livros sem autor
	public Livro() {
	}

	// Esse método define um comportamento para a classe
	public void mostrarDetalhes() {
		String mensagem = "Mostrando detalhes do livro ";
		System.out.println("Nome " + nome);
		System.out.println("Descricao " + descricao);
		System.out.println("Valor " + valor);
		System.out.println("ISBN " + isbn);

		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}

		System.out.println("--");
	}

	// metodo Abstrato para aplicar descontos nas subclasses
	public abstract  boolean aplicaDescontoDe(double porcentagem); 
		

	// metodo para retorna V ou F se tem autor, pois alguns livros não tem autor
	boolean temAutor() {
		return this.autor != null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}
