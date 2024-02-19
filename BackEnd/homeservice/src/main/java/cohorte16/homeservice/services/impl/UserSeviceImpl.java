package cohorte16.homeservice.services.impl;

import cohorte16.homeservice.models.DatosLigin;
import cohorte16.homeservice.models.DatosRegistroUsuario;
import cohorte16.homeservice.models.User;
import cohorte16.homeservice.repositories.UsuariosRepository;
import cohorte16.homeservice.services.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserSeviceImpl implements UserService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public User saveUser(DatosRegistroUsuario datosRegistroUsuario) {
       return usuariosRepository.save(new User(datosRegistroUsuario));
    }

    @Override
    public String validateLogin(DatosLigin datosLogin) {
        String respuesta = "error en los dato enviados";

        if (User.class == usuariosRepository.findByEmailAndContrasenia(datosLogin.email(), datosLogin.contrasenia() ).getClass()   ){
            respuesta = "jwt clave super secreta";
        }
        return respuesta;

    }
    }

