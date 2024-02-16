package cohorte16.homeservice.models;


import jakarta.persistence.*;
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
    private String name;

    @Column(name = "apellido")
    private String lastname;

    @Column(name = "dni")
    private String dni;

    @Column(name = "imagen")
    private String image;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "clasificacion")
    private Integer classification;

    @Column(name = "activo")
    private Boolean active;

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
