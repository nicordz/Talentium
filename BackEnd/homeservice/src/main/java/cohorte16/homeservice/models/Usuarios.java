package cohorte16.homeservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "")
@Entity(name = "Usuarios")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "contrasenia")
    private String contrasenia;
    @Column(name = "avatar")
    private String avatar;

    public Usuarios(DatosRegistroUsuario datosRegistroUsuario) {
        this.email = datosRegistroUsuario.email();
        this.contrasenia = datosRegistroUsuario.contrasenia();
        this.avatar = datosRegistroUsuario.avatar();
    }
}