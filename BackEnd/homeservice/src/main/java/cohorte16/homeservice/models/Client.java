package cohorte16.homeservice.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    @NotBlank
    private String name;

    @Column(name = "apellido")
    @NotBlank
    private String lastname;

    @Column(name = "dni")
    @NotBlank
    private String dni;

    @Column(name = "imagen")
    private String urlImage;

    @Column(name = "clasificacion")
    @NotNull
    private Integer classification;

    @Column(name = "activo")
    private Boolean active = Boolean.TRUE;

/*
    @Column(name = "cliente_usuario_id")
    private Usuarios userId;

    @Column(name = "cliente_direccion_id")
    private Direcciones directionId;

    //ACA LA CLASE DE LAFK
    @Column(name = "cliente_orden_id")
    private Ordenes orderId;

    @Column(name = "compra_id")
    private Compras purchaseId;
*/

}
