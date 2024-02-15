package cohorte16.homeservice.controllers;

import cohorte16.homeservice.models.DatosRegistroUsuario;
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
        System.out.println(datosRegistroUsuario);
    }
}
