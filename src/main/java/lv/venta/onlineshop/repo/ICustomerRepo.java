package lv.venta.onlineshop.repo;

import jakarta.transaction.Transactional;
import lv.venta.onlineshop.model.Customer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepo extends CrudRepository<Customer, Long>{
    @Query("SELECT c FROM Customer c")
    public List<Customer> getAll();

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Customers (first_name, last_name, email, phone_no, address, country, zip_code) " +
            "VALUES (:firstName, :lastName, :email, :phone, :address, :country, :zipCode)", nativeQuery = true)
    int insertCustomer(
            @Param("firstName") String firstName,
            @Param("lastName") String lastName,
            @Param("email") String email,
            @Param("phone") String phone,
            @Param("address") String address,
            @Param("country") String country,
            @Param("zipCode") String zipCode
    );
}
