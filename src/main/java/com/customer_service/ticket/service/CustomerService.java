package com.customer_service.ticket.service;

import com.customer_service.ticket.model.Customer;
import com.customer_service.ticket.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Customer getCustomerById(String id){
      return this.customerRepository.findById(id).orElse(null);

    }

    public List<Customer> getAllCustomers(){
        return this.customerRepository.findAll();
    }

    public Customer createCustomer(Customer customer){
        return this.customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer){
        return this.customerRepository.save(customer);
    }

    public Customer deleteCustomer(String id){
        Optional<Customer> customer = this.customerRepository.findById(id);
        if(customer.isPresent()){
            this.customerRepository.delete(customer.get());
            return customer.get();
        }
        return null;
    }
}
