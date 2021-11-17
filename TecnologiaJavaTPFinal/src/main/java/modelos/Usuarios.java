package modelos;

public class Usuarios {
	private int id;
	private String username;
	private String password;
	private String rol;

	public Usuarios(String username, String password, String rol) {
		super();
		this.username = username;
		this.password = password;
		this.rol = rol;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Usuarios() {
		super();
	}

	public Usuarios(int id) {
		super();
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getUsername() {
		return username;
	}

	public boolean validar(String password) {
		return this.getPassword().equals(password);
	}

}
