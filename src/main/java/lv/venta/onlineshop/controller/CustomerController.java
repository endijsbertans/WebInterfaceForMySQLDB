package lv.venta.onlineshop.controller;

import jakarta.validation.Valid;
import lv.venta.onlineshop.model.Customer;
import lv.venta.onlineshop.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping("/show/all")
    public String showAllCustomers(Model model) {
        System.out.println(customerService.retrieveAllCustomers());
        System.out.println("TESTTEST");
        List<Customer> test = customerService.retrieveAllCustomers();
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

    @GetMapping("/add")
    public String getDriverAdd(Model model) {
        model.addAttribute("title", "Add customer"); // Adds the page title.
        model.addAttribute("customer", new Customer()); // Adds the customer object.
        return "insert-customer-page"; // Return the name of the HTML file.
    }
    @PostMapping("/add")
    public String postDriverAdd(@Valid Customer customer, BindingResult result){
        if(result.hasErrors()){
            return "insert-customer-page";
        }else{
            try {
                customerService.insertNewCustomer(customer);
                return "redirect:/customer/show/all";
            } catch (Exception e) {
                return "redirect:/error";
            }
        }
    }
}
