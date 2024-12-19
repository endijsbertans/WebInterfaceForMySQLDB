package lv.venta.onlineshop.repo;

import lv.venta.onlineshop.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ICustomerRepo extends CrudRepository<Customer, Long>{
    @Query("SELECT c FROM Customer c")
    public ArrayList<Customer> getAll();
}
