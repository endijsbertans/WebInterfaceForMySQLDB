package lv.venta.onlineshop.service;

import jakarta.transaction.Transactional;
import lv.venta.onlineshop.model.Customer;

import java.util.ArrayList;
import java.util.List;

public interface ICustomerService {
    public List<Customer> retrieveAllCustomers();


    Customer insertNewCustomer(Customer customer);
}