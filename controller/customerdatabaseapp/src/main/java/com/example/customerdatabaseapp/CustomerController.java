package com.example.customerdatabaseapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CustomerController {

    @Autowired
private CustomerService customerService;

 @RequestMapping("/customers")
    public List<Customer> getAllCustomers(){

     return customerService.getAllCustomers();
 }

@RequestMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable Long id){
     return  customerService.getCustomer(id);
}

@RequestMapping(method = RequestMethod.POST, value = "/customers")
    public void addCustomer(@RequestBody Customer customer){
     customerService.addCustomer(customer);
}

@RequestMapping(method = RequestMethod.PUT, value = "/customers/{name}")
    public void updateCustomer(@RequestBody Customer customer, @PathVariable Long id){
     customerService.updateCustomer(id,customer);
}

@RequestMapping(method = RequestMethod.DELETE, value = "/customers/{name}")
    public void deleteCustomer(@PathVariable Long id){
     customerService.deleteCustomer(id);
}


}
