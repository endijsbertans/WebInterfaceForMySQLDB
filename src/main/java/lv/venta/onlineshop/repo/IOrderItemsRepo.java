package lv.venta.onlineshop.repo;

import lv.venta.onlineshop.model.OrderItems;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderItemsRepo extends CrudRepository<OrderItems, Long> {
}
