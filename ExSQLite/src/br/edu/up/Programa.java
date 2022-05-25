package br.edu.up;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Programa {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		incluir();
		listar();
		atualizar();
		apagar();
		
	}
	
	
	//Função Incluir
	public static void incluir() throws SQLException{
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\Documents\\SQLite\\ExSQLite\\db\\primeiro_banco_de_dados.db";
		
		
		//1.Abri a conexão com banco de dados.
		Connection conexao = DriverManager.getConnection(url);
				
				
		//2.Criar comando e executar o SQL.
		Statement comando = conexao.createStatement();
		String queryInsert = "insert into cliente (nome, dta_nascimento,cpf,email) "
				+ " values ('Ana','2000/06/23','7654321','ana@gmail.com')";
		comando.execute(queryInsert);
				
	}
	
	
	//Função Listar
	public static void listar() throws SQLException{
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\Documents\\SQLite\\ExSQLite\\db\\primeiro_banco_de_dados.db";
		
		
		//1.Abri a conexão com banco de dados.
		Connection conexao = DriverManager.getConnection(url);
				
				
		//2.Criar comando e executar o SQL.
		Statement comando = conexao.createStatement();
		String querySelect = "select * from cliente";
		ResultSet resultado = comando.executeQuery(querySelect);
				
				
		//3.Mostrar os dados.
		while(resultado.next()) {
			int codigo = resultado.getInt(1);
			String nome = resultado.getString(2);
			String dta_nascimento = resultado.getString(3);
			String cpf = resultado.getString(4);
			String email = resultado.getString(5);
			
			System.out.println("Código: " + codigo);
			System.out.println("Nome: " + nome);
			System.out.println("---------------------");
		}
	}
	
	//Função Atualizar
	public static void atualizar() throws SQLException{
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\Documents\\SQLite\\ExSQLite\\db\\primeiro_banco_de_dados.db";
		
		
		//1.Abri a conexão com banco de dados.
		Connection conexao = DriverManager.getConnection(url);
				
				
		//2.Criar comando e executar o SQL.
		Statement comando = conexao.createStatement();
		String queryUpdate = "update cliente set nome = 'Ana Maria' where codigo = 2";
		comando.executeUpdate(queryUpdate);
				
	}
	
	
	//Função Apagar
	public static void apagar() throws SQLException{
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\Documents\\SQLite\\ExSQLite\\db\\primeiro_banco_de_dados.db";
		
		
		//1.Abri a conexão com banco de dados.
		Connection conexao = DriverManager.getConnection(url);
				
				
		//2.Criar comando e executar o SQL.
		Statement comando = conexao.createStatement();
		String queryDelete = "delete from cliente where codigo = 1";
		comando.execute(queryDelete);
				
	}

}
