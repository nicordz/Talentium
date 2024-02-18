package cohorte16.homeservice.models;



import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record DatosRegistroUsuario( Long id,@NotBlank String email, @NotBlank String contrasenia, String avatar) {
    public DatosRegistroUsuario(User userCreated) {
        this(userCreated.getId(),userCreated.getEmail(),userCreated.getContrasenia(),userCreated.getAvatar());
    }



}
