package dao;
import modelos.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UsuariosDAO implements DAO<Usuarios> {

	private conexion conexion = new conexion();
	@Override
	public List<Usuarios> listar() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Usuarios t) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuarios getById(int id) throws SQLException {

		Usuarios user = null;

		conexion.conectar("usuarios");
		

		PreparedStatement ps = conexion.getPreparedStatement("select * from usuarios" + " where id = ?");

		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			user = new Usuarios();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setRol(rs.getString("rol"));
		}

		conexion.desconectar();

		return user;
	}

	public boolean existeByUsername(String username) throws SQLException {
		return this.getByUsername(username) != null;
	}

	public Usuarios getByUsername(String usuario) throws SQLException {

		Usuarios user = null;

		conexion.conectar("usuarios");

		PreparedStatement ps = conexion.getPreparedStatement("select * from usuarios" + " where usuario = ?");

		ps.setString(1, usuario);

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			user = new Usuarios();
			user.setId(rs.getInt("idusuario"));
			user.setUsername(rs.getString("usuario"));
			user.setPassword(rs.getString("contraseña"));
			user.setRol(rs.getString("rol"));
		}

		conexion.desconectar();

		return user;
	}
	public boolean logear(String username, String clave) throws SQLException {
		return this.verificarlogin(username, clave) != null;
	}
	public Usuarios verificarlogin(String usuario, String clave) throws SQLException {

		Usuarios user = null;

		conexion.conectar("usuarios");

		PreparedStatement ps = conexion.getPreparedStatement("select * from usuarios" + " where usuario = ? and contraseña = ?");

		ps.setString(1, usuario);
		ps.setString(2, clave);

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			user = new Usuarios();
			user.setId(rs.getInt("idusuario"));
			user.setUsername(rs.getString("usuario"));
			user.setPassword(rs.getString("contraseña"));
			user.setRol(rs.getString("rol"));
		}

		conexion.desconectar();

		return user;
	}

	@Override
	public void insert(Usuarios user) throws SQLException {

		conexion.conectar("usuarios");

		PreparedStatement ps = conexion.getPreparedStatementInserts(
				"insert into usuarios" + " (username, password, nickname)" + " values (?, ?, ?)");

		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getRol());

		ps.executeUpdate();

		ResultSet keys = ps.getGeneratedKeys();
		keys.next();
		int id = keys.getInt(1);
		user.setId(id);

		conexion.desconectar();

	}

}
