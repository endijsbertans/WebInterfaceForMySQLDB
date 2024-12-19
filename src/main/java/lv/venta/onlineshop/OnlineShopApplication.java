package lv.venta.onlineshop;

import lv.venta.onlineshop.model.Customer;
import lv.venta.onlineshop.repo.ICustomerRepo;
import lv.venta.onlineshop.service.ICustomerService;
import lv.venta.onlineshop.service.IOrderItemsService;
import lv.venta.onlineshop.service.IOrdersService;
import lv.venta.onlineshop.service.IProductsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnlineShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineShopApplication.class, args);
    }
    @Bean
    public CommandLineRunner testDatabaseLayer(
            ICustomerRepo customerRepo) {
        return new CommandLineRunner() {


            @Override
            public void run(String... args) throws Exception {
//                Customer customer = new Customer( "John", "Doe", "Asdasd", "29666117", "Asdsd", "Asdasd", "LV-3601");
//                // Use setter methods to set values
//
//                customerRepo.save(customer);
//                System.out.println("Customer: " + customer);
            }
        };
    }
}
