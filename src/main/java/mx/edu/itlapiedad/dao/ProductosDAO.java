package mx.edu.itlapiedad.dao;

import java.util.List;

import mx.edu.itlapiedad.models.Productos;

public interface ProductosDAO {
	
	List<Productos> ConsultarProdutos();

	List<Productos> ConsultarProductos();

	Productos buscar(int id);

}
