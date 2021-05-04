package mx.edu.itlapiedad.dao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import mx.edu.itlapiedad.models.Productos;


@Repository
public class ProductosJDBC implements ProductosDAO {

@Autowired
JdbcTemplate conexion;

	@Override
	public List<Productos> ConsultarProductos() {
	String sql_query = "SELECT * FROM productos";
		return conexion.query(sql_query, new RowMapper<Productos>() {
			public Productos mapRow(ResultSet rs, int rowNum) throws SQLException {
				Productos producto = new Productos ();
				producto.setId(rs.getInt("id"));
				producto.setDescripcion(rs.getString("descripcion"));
				producto.setPrecio(rs.getDouble("precio"));
				producto.setCodigo_barras(rs.getString("codigo_barras"));
				producto.setExistencia(rs.getInt("existencia"));
				
			 
			  return producto;
			}
			
		});
	}
	
	@Override
	public Productos buscar(int id) {
		String sql_query = "SELECT * FROM productos where id=?";
		return conexion.queryForObject(sql_query, new RowMapper<Productos>() {
			public Productos mapRow(ResultSet rs, int rowNum) throws SQLException {
				Productos produc = new Productos ();
				produc.setId(rs.getInt("id"));
				produc.setDescripcion(rs.getString("descripcion"));
				produc.setPrecio(rs.getDouble("precio"));
				produc.setCodigo_barras(rs.getString("codigo_barras"));
				produc.setExistencia(rs.getInt("existencia"));
				
			  return produc;
			}
			
		},id);
	}

	@Override
	public List<Productos> ConsultarProdutos() {
		// TODO Auto-generated method stub
		return null;
	}

}
