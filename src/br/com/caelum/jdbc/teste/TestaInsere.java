package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {
	public static void main(String[] args) {
		Contato contato = new Contato();

		// pronto para gravar
		contato.setNome("Rudi");
		contato.setEmail("r.rodrigues78@yahoo.com.br");
		contato.setEndereco("R. Croata 464 cj7");
		contato.setDataNascimento(Calendar.getInstance());

		// grave nessa conexão!!!
		ContatoDao dao = new ContatoDao();

		// método elegante
		dao.adiciona(contato);

		System.out.println("Gravado!");
	}
}
