package aula06_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		// vari�veis de conex�o
		String url = "jdbc:postgresql://localhost:5432/loja";
		String user = "postgres";
		String pass = "19981008";
				
		// conex�o com o banco de dados
		// Connection con = DriverManager.getConnection(url);
		try {
			return DriverManager.getConnection(url, user, pass);
			
		} catch (SQLException e) {
			// Quem importa-lo ter� que tratar esse possivel erro
			throw new RuntimeException();
		}
	}
}
