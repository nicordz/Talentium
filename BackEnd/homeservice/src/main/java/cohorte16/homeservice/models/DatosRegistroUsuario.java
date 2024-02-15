package cohorte16.homeservice.models;



import jakarta.validation.constraints.NotBlank;

public record DatosRegistroUsuario(@NotBlank String email, @NotBlank String contrasenia, String avatar) {
}
