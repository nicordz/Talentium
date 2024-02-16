package cohorte16.homeservice.services;

import cohorte16.homeservice.models.DatosLigin;
import cohorte16.homeservice.models.DatosRegistroUsuario;

public interface UserService {

    public void saveUser(DatosRegistroUsuario datosRegistroUsuario);

    public String validateLogin(DatosLigin datosLogin);
}
