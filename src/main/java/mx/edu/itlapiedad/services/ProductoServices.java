package mx.edu.itlapiedad.services;
import java.util.List;


import mx.edu.itlapiedad.models.Productos;

public interface ProductoServices {

	List<Productos> ConsultarProductos();

	Productos buscar(int id);
}
