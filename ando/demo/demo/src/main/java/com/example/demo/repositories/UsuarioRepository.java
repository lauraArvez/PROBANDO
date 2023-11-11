import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.UsuarioModel;

/**
 * Interfaz repository hace las conexiones con la bbdd y utiliza el modelo para saber
 * que tipo de información devolvera.
 */

@Repository
 public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
 
   
    
}
