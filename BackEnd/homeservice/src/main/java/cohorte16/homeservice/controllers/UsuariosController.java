package cohorte16.homeservice.controllers;

import cohorte16.homeservice.models.DatosLigin;
import cohorte16.homeservice.models.DatosRegistroUsuario;
import cohorte16.homeservice.models.Usuarios;
import cohorte16.homeservice.repositories.UsuariosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @PostMapping
    public void RegistrarUsuario(@RequestBody @Valid DatosRegistroUsuario datosRegistroUsuario){
       usuariosRepository.save(new Usuarios(datosRegistroUsuario));
    }


    @GetMapping
    public String login(@RequestBody @Valid DatosLigin datosLogin){
String respuesta = "error en los dato enviados";

        if (Usuarios.class == usuariosRepository.findByEmailAndContrasenia(datosLogin.email(), datosLogin.contrasenia() ).getClass()   ){
            respuesta = "jwt clave super secreta";
        }
        return respuesta;

    }
}
