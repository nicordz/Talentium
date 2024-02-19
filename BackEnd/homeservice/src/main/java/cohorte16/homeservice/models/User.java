package cohorte16.homeservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuarios")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "email",nullable = false, unique = true )
    private String email;
    @Column(name = "contrasenia", nullable = false)
    private String contrasenia;
    @Column(name = "avatar")
    private String avatar;

    public User(DatosRegistroUsuario datosRegistroUsuario) {
        this.email = datosRegistroUsuario.email();
        this.contrasenia = datosRegistroUsuario.contrasenia();
        this.avatar = datosRegistroUsuario.avatar();
    }
}