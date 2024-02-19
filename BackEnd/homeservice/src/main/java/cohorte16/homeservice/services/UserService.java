package cohorte16.homeservice.services;

import cohorte16.homeservice.models.DatosLigin;
import cohorte16.homeservice.models.DatosRegistroUsuario;
import cohorte16.homeservice.models.User;

public interface UserService {

    public User saveUser(DatosRegistroUsuario datosRegistroUsuario);

    public String validateLogin(DatosLigin datosLogin);
}
