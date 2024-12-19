package lv.venta.onlineshop.repo;

import lv.venta.onlineshop.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<Orders, Long> {
}
