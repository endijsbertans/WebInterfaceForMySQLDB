package lv.venta.onlineshop.service;

import lv.venta.onlineshop.model.Customer;

import java.util.ArrayList;

public interface ICustomerService {
    public ArrayList<Customer> retrieveAllCustomers();
}
