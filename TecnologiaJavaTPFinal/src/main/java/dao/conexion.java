package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class conexion {

	private final String server = "jdbc:mysql://localhost/";
	private String base ;
	private final String user = "root";
	private final String password = "";

	private Connection conn;
	
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	
	public void conectar(String base) throws SQLException {
		this.base = base;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		this.conn = DriverManager.getConnection(server+base, user, password);

	}

	public PreparedStatement getPreparedStatementInserts(String sQuery) throws SQLException {
		return this.conn.prepareStatement(sQuery, Statement.RETURN_GENERATED_KEYS);
	}

	public PreparedStatement getPreparedStatement(String sQuery) throws SQLException {
		return this.conn.prepareStatement(sQuery);
	}

	public void desconectar() throws SQLException {
		this.conn.close();
	}
}
