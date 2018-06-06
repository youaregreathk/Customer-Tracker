package com.lc.spring.controller;

import com.lc.spring.entity.Customer;
import com.lc.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.List;


@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    //Get all the customers
    @GetMapping("/customer")
    public List<Customer> index() {
        System.out.println("I am here");
        //Customer c1= customerService.findById(2);
        //customerService.getCustomer();
        System.out.println(customerService.getCustomer());
        return  customerService.getCustomer();
    }

    //Get all the customers with particular id
    @GetMapping("/customer")
    public Customer showFormForUpdate(@RequestParam("cutomerId") int theId,
                                      Model theModel) {
        Customer theCustomer = customerService.getCustomer(theId);
        return theCustomer;
    }

    //From posting
    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("cusotmer") Customer theCustomer) {
        customerService.saveCustomer(theCustomer);
        return "Successful saving :)" + theCustomer;
    }


}
