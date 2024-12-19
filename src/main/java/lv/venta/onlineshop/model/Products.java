package lv.venta.onlineshop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "products")
@Entity
public class Products {
    @Setter(value = AccessLevel.NONE)
    @Column(name = "product_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProduct;

    @NotNull
    @Column(name = "product_name")
    @Pattern(regexp = "[A-ZĒŪĪĻĶĢŠĀČŅ]{1}[a-zēūīļķģšāžčņ]+")
    private String productName;

    @NotNull
    @Column(name = "category")
    @Pattern(regexp = "[A-ZĒŪĪĻĶĢŠĀČŅ]{1}[a-zēūīļķģšāžčņ]+")
    private String category;

    @NotNull
    @Column(name = "price")
    @Min(0)
    private double price;

    @NotNull
    @Column(name = "stock")
    @Min(0)
    private int stock;

}
