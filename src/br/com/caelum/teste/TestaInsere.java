package br.com.caelum.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.modelo.Funcionario;

public class TestaInsere {

	/*public static void main(String[] args) {
		 Contato contato = new Contato();
		 contato.setNome("Caelum");
		 contato.setEmail("contato@caelum.com.br");
		 contato.setEndereco("R. Vergueiro 3185 cj57");
		 contato.setDataNascimento(Calendar.getInstance());
		 
		 // grave nessa conexão!!!
		 ContatoDao dao = new ContatoDao();
		 
		 // método elegante
		 dao.adiciona(contato);
		 
		 System.out.println("Gravado!");
	}*/
	
	public static void main(String[] args) {
		 Funcionario funcionario = new Funcionario();
		 funcionario.setNome("Lucas");
		 funcionario.setUsuario("lcyrillo");
		 funcionario.setSenha("123567");
		 
		 // grave nessa conexão!!!
		 FuncionarioDao dao = new FuncionarioDao();
		 
		 // método elegante
		 dao.adiciona(funcionario);
		 
		 System.out.println("Gravado!");
	}
}
