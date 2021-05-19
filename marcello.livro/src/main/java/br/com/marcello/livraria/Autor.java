package br.com.marcello.livraria;

public class Autor {

	private String nome;
	private String email;
	private String cpf;	

	void mostrarDetalhes() {
		System.out.println("mostrando detalhes do autor ");
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("CPF: " + cpf);
	}
	
	//Estamos definindo que sempre que um Autor tiver um nome igual a outro, são iguais
	@Override
	public boolean equals(Object obj) {
		Autor outro = (Autor) obj;
		return this.nome.equals(outro.nome);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}