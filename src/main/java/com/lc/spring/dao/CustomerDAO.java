package com.lc.spring.dao;

import com.lc.spring.entity.Customer;

import java.util.List;



public interface CustomerDAO {

    public Customer getCustomers(int id);

    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);


}