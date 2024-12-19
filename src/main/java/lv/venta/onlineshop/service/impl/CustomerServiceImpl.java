package lv.venta.onlineshop.service.impl;

import lv.venta.onlineshop.model.Customer;
import lv.venta.onlineshop.repo.ICustomerRepo;
import lv.venta.onlineshop.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepo customerRepo;

    @Override
    public List<Customer> retrieveAllCustomers(){
        return customerRepo.getAll();
    }




    @Override
    public Customer insertNewCustomer(Customer customer){
        customerRepo.insertCustomer(
                customer.getName(),
                customer.getSurname(),
                customer.getEmail(),
                customer.getPhone(),
                customer.getAddress(),
                customer.getCountry(),
                customer.getZipCode());
        return customer;
    }

}
