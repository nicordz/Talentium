package cohorte16.homeservice.models;

import jakarta.validation.constraints.NotBlank;

public record DatosLigin(@NotBlank String email, @NotBlank String contrasenia) {
}
