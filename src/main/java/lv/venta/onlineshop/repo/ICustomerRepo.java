package lv.venta.onlineshop.repo;

import lv.venta.onlineshop.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepo extends CrudRepository<Customer, Long>{
}
