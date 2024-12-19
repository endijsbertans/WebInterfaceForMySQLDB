package lv.venta.onlineshop.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "order_items")
@Entity
public class OrderItems {
    @Setter(value = AccessLevel.NONE)
    @Column(name = "order_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idOrderItem;

    @NotNull
    @Column(name = "quantity")
    @Min(0)
    private int quantity;

    @Valid
    @OneToOne
    @JoinColumn(name = "product_id")
    private Products product;

    @Valid
    @OneToOne
    @JoinColumn(name = "order_id")
    private Orders order;

}
