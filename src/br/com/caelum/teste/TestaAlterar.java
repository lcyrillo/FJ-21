package br.com.caelum.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.modelo.Contato;
import br.com.caelum.modelo.Funcionario;

public class TestaAlterar {

/*public static void main(String[] args) throws SQLException {
	
	ContatoDao dao = new ContatoDao();
	
	List<Contato> contatos = dao.pesquisar(2);
		
	for(Contato contato : contatos){
		System.out.println(contato.getNome());
		System.out.println(contato.getEmail());
		System.out.println(contato.getEndereco());
		//System.out.println(contato.getDataNascimento());
		}
	}*/
	
	/*public static void main(String[] args) throws SQLException {
		
		FuncionarioDao dao = new FuncionarioDao();
		
		List<Funcionario> funcionarios = dao.pesquisar(2);
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("NomeAlterado");
		
		dao.altera(funcionario);
			
		for(Funcionario f : funcionarios){	
			System.out.println(f.getNome());
			System.out.println(f.getUsuario());
			System.out.println(f.getSenha());
			//System.out.println(contato.getDataNascimento());
		}
	}*/
}


