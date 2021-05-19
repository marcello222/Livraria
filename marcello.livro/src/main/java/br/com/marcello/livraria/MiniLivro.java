package br.com.marcello.livraria;

public class MiniLivro extends Livro {
	
	public MiniLivro(Autor autor) {
		super(autor);
	}
	
	//Metodo de desconto abstrato da classe Mãe Livro. obrigatoriamente tem que ter na classe filha
	@Override
	public  boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}

}
