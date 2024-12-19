package lv.venta.onlineshop.service.impl;

import lv.venta.onlineshop.model.Customer;
import lv.venta.onlineshop.repo.ICustomerRepo;
import lv.venta.onlineshop.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepo customerRepo;

    public ArrayList<Customer> retrieveAllCustomers(){
        return customerRepo.getAll();
    }
}
