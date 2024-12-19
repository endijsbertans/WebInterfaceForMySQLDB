package lv.venta.onlineshop.controller;

import lv.venta.onlineshop.model.Customer;
import lv.venta.onlineshop.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping("/show/all")
    public String showAllCustomers(Model model) {
        System.out.println(customerService.retrieveAllCustomers());
        System.out.println("TESTTEST");
        ArrayList<Customer> test = customerService.retrieveAllCustomers();
        for( Customer temp : test){
            System.out.println(temp.getName());
        }
        try {
            model.addAttribute("myObjs", customerService.retrieveAllCustomers());

            model.addAttribute("title", "All Customers");
            return "show-all-customers";
        } catch (Exception e) {
            model.addAttribute("msg", e.getMessage());
            model.addAttribute("title", "Error Page");
            return "error-page";
        }
    }
}
