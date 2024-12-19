package lv.venta.onlineshop.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "orders")
@Entity
public class Orders {

    @Setter(value = AccessLevel.NONE)
    @Column(name = "order_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idOrder;

    @NotNull
    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @NotNull
    @Column(name =  "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @NotNull
    @Column(name =  "delivery_address")
    private String deliveryAddress;

    @Valid
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
