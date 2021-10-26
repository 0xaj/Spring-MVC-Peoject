package com.hexaware.service;


import java.util.List;
import com.hexaware.entity.*;


public interface CustomerService {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}