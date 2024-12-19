package lv.venta.onlineshop.repo;

import lv.venta.onlineshop.model.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductsRepo extends CrudRepository<Products, Long> {
}
