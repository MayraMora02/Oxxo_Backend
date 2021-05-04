package mx.edu.itlapiedad.controladores;

//import java.util.List;

//import org.springframework.dao.DataAccessException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import mx.edu.itlapiedad.models.Productos;
//import mx.edu.itlapiedad.services.ProductoServices;


@RestController
@RequestMapping("/devops")
public class Mensaje {
	
	@GetMapping("/hola")
	public String mostrarHola(@RequestParam String nombre) {
		return "Hola" + nombre;
	}
		
	
}
