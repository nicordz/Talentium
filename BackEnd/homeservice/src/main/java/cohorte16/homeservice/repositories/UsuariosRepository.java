package cohorte16.homeservice.repositories;

import cohorte16.homeservice.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository <Usuarios,Long> {
}