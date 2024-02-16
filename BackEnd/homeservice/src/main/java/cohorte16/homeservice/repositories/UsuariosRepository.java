package cohorte16.homeservice.repositories;

import cohorte16.homeservice.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository <Usuarios,Long> {


   /* @Query(value = "SELECT * FROM usuarios WHERE email = :email AND contrasenia = :contrasenia", nativeQuery = true)
    Usuarios findByEmailAndContrasenia();*/


    Usuarios findByEmailAndContrasenia(String email, String contrasenia);
}