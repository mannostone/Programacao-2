package aula06_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
	public static void main (String [] args) {
		
		// MVC
			// Model (modelo)
			// View (visão)
			// Control (controle)
		
		// variáveis de conexão
		String url = "jdbc:postgresql://localhost:5432/loja";
		String user = "postgres";
		String pass = "19981008";
		
		// conexão com o banco de dados
		// Connection con = DriverManager.getConnection(url);
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			con.close();
			System.out.println("Conexão concluída.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
	}
}