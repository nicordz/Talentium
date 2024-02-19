package cohorte16.homeservice.controllers;

import cohorte16.homeservice.models.DatosLigin;
import cohorte16.homeservice.models.DatosRegistroUsuario;
import cohorte16.homeservice.models.User;
import cohorte16.homeservice.services.impl.UserSeviceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UserSeviceImpl userSeviceImpl;

    @PostMapping
    public ResponseEntity<?> RegistrarUsuario(@RequestBody @Valid DatosRegistroUsuario datosRegistroUsuario){

        User userCreated;
        try {
          userCreated =  userSeviceImpl.saveUser(datosRegistroUsuario);

        }catch (Exception ex){

            return  ResponseEntity.status(HttpStatus.CONFLICT).body("El usuario ya existe");
        }

        //devulve por convencion la url con los datos del usuario crado
        return ResponseEntity.created(URI.create("/usuarios/"+new DatosRegistroUsuario(userCreated).id())).body(DatosRegistroUsuario.builder()
                .avatar(userCreated
                        .getAvatar())
                .email(userCreated.getEmail())
                .id(userCreated.getId()).build());
    }


    @PostMapping( value = "/login")
    public ResponseEntity <String>login(@RequestBody @Valid DatosLigin datosLogin) {
        try {
            userSeviceImpl.validateLogin(datosLogin);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales incorrectas");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body("Inicio de secion correcto");
    }
}
