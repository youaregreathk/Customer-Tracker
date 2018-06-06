package com.lc.spring.service;

import com.lc.spring.entity.Customer;
import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomer();

    public Customer getCustomer(int id);

    public void saveCustomer(Customer theCustomer);

}
