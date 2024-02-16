package cohorte16.homeservice.models;

import cohorte16.homeservice.enums.Profession;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name="Profesionales")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Professional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    @NotBlank
    private String name;

    @Column(name = "apellido")
    @NotBlank
    private String lastname;

    @Column(name = "cuit")
    @NotBlank
    private String cuit;

    @Column(name = "PROFESION")
    @Enumerated(value = EnumType.STRING)
    private Profession profession;

    @Column(name = "cbu")
    private String cbu;

    @Column(name = "clasificacion")
    @NotNull
    private Integer classification;

    @Column(name = "imagen")
    private String urlImage;

    @Column(name = "activo")
    private boolean active = Boolean.FALSE;

    //private User userApp;
    //private Direction direction;
    //private List<Product> ProductList;
    //private List<Order> OrderList;







}
