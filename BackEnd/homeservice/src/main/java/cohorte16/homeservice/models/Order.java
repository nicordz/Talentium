package cohorte16.homeservice.models;

import cohorte16.homeservice.enums.Orderstatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ordenes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descripcion")
    @NotBlank
    private String description;

    @Column(name = "precio")
    @DecimalMin(value = "0.01")
    private BigDecimal price;

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date date;

    @Column(name = "ESTADO")
    @Enumerated(value = EnumType.STRING)
    private Orderstatus orderstatus;

    @ManyToOne
    @JoinColumn(name = "profesional_id", referencedColumnName = "id")
    private Professional professional;

}
