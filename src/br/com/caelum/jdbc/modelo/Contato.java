package br.com.caelum.jdbc.modelo;

import java.util.Calendar;

public class Contato {
	private Long id;
	private String nome;
	private String email;
	private String endereco;

	@Override
	public String toString() {
		String retorno = "Nome: " + this.nome + " ";
		retorno += "\nEmail: " + this.email + " ";
		retorno += "\nEndereço: " + this.endereco + " ";
		retorno += "\nData de Nascimento: "
				+ this.getDataNascimento().getTime() + "\n";
		return retorno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	private Calendar dataNascimento;

}
