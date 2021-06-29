package aula06_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
	public static void main (String [] args) {
		
		// MVC
			// Model (modelo)
			// View (vis�o)
			// Control (controle)
		
		// vari�veis de conex�o
		String url = "jdbc:postgresql://localhost:5432/loja";
		String user = "postgres";
		String pass = "19981008";
		
		// conex�o com o banco de dados
		// Connection con = DriverManager.getConnection(url);
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			con.close();
			System.out.println("Conex�o conclu�da.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
	}
}