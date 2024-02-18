package cohorte16.homeservice.controllers;

import cohorte16.homeservice.models.DatosLigin;
import cohorte16.homeservice.models.DatosRegistroUsuario;
import cohorte16.homeservice.services.impl.UserSeviceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UserSeviceImpl userSeviceImpl;

    @PostMapping
    public void RegistrarUsuario(@RequestBody @Valid DatosRegistroUsuario datosRegistroUsuario){
       userSeviceImpl.saveUser(datosRegistroUsuario).OrElse(userSeviceImpl.validateLogin(datosRegistroUsuario));
    }


    @GetMapping
    public String login(@RequestBody @Valid DatosLigin datosLogin) {


        return userSeviceImpl.validateLogin(datosLogin);
    }
}
