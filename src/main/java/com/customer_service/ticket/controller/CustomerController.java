package com.customer_service.ticket.controller;

import com.customer_service.ticket.model.Customer;
import com.customer_service.ticket.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable String id){
        return this.customerService.getCustomerById(id);
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
       return this.customerService.getAllCustomers();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
    return this.customerService.createCustomer(customer);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        return this.customerService.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public Customer deleteCustomer(@PathVariable String id){
        return this.customerService.deleteCustomer(id);
    }
}
