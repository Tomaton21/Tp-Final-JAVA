package dao;

import java.sql.SQLException;
import java.util.List;


public interface DAO<T> {

	
	public List<T> listar() throws SQLException;
	public void update(T t) throws SQLException;
	public T getById(int id) throws SQLException;
	public void insert(T t) throws SQLException;
	

	
}
