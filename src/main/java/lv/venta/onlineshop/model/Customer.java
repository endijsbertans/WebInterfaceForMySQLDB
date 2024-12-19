package lv.venta.onlineshop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@ToString
@Table(name = "Customers")
@Entity
public class Customer {

    @Column(name = "customer_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

    @NotNull
    @Column(name = "first_name")
    @Pattern(regexp = "[A-ZĒŪĪĻĶĢŠĀČŅ][a-zēūīļķģšāžčņ]+")
    private String name;

    @NotNull
    @Column(name = "last_name")
    @Pattern(regexp = "[A-ZĒŪĪĻĶĢŠĀČŅ][a-zēūīļķģšāžčņ]+")
    private String surname;

    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "phone_no")
    @Pattern(regexp = "2\\d{7}")
    private String phone;

    @NotNull
    @Column(name = "address")
    @Pattern(regexp = "[A-ZĒŪĪĻĶĢŠĀČŅ][a-zēūīļķģšāžčņ]+")
    private String address;

    @NotNull
    @Column(name = "country")
    @Pattern(regexp = "[A-ZĒŪĪĻĶĢŠĀČŅ][a-zēūīļķģšāžčņ]+")
    private String country;

    @NotNull
    @Column(name = "zip_code")
    private String zipCode;

    public Customer(String name, String surname, String email, String phone, String address, String country, String zipCode){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.country = country;
        this.zipCode = zipCode;
    }

}
