package mx.edu.itlapiedad.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.dao.ProductosDAO;
import mx.edu.itlapiedad.models.Productos;

@Repository
public class ProductosLogic implements ProductoServices{

	ProductosDAO repositorio;
	public List<Productos> ConsultarProductos(){
		return repositorio.ConsultarProdutos();
	}
	
	@Override
	public Productos buscar(int id) {
		return repositorio.buscar(id);
	}
}
