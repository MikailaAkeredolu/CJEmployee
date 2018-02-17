package io.mikaila.springhomework;
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

@RequestMapping("/customers/{name}")
    public Customer getCustomer(@PathVariable String name){
     return  customerService.getCustomer(name);
}

@RequestMapping(method = RequestMethod.POST, value = "/customers")
    public void addCustomer(@RequestBody Customer customer){
     customerService.addCustomer(customer);
}

@RequestMapping(method = RequestMethod.PUT, value = "/customers/{name}")
    public void updateCustomer(@RequestBody Customer customer, @PathVariable String name){
     customerService.updateCustomer(name,customer);
}

@RequestMapping(method = RequestMethod.DELETE, value = "/customers/{name}")
    public void deleteCustomer(@PathVariable String name){
     customerService.deleteCustomer(name);
}


}
