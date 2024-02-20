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
    private Boolean active = Boolean.FALSE;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_usuario_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_direccion_id")
    private Direction direction;

    /*@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_orden_id",referencedColumnName = "id")
    private Order order;*/

    //ACA LA CLASE DE LAFK
/*
    @Column(name = "cliente_orden_id")
    private Ordenes order;

    @Column(name = "compra_id")
    private Compras purchaseId;
*/

}
