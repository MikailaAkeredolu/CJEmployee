package com.example.customerdatabaseapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {
    //    private List<Customer>customers = new ArrayList<>(Arrays.asList(
//            new Customer("Mike", 23),
//            new Customer("Jones", 21)
//    ));

    @Autowired  //Mark - Crud repository instance as autowired
    private CustomerRepository customerRepository;

    //iterate through all the topics in the database
    //for each element found put the element into the topics Array list
    public List<Customer> getAllCustomers() {
        //return customers;
        List<Customer>customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    public Customer getCustomer(Long id){
        return customerRepository.findOne(id);
    }

    public void addCustomer(Customer customer){
        //customers.add(customer);
        customerRepository.save(customer);
    }

    public void updateCustomer(Long id, Customer customer){
        customerRepository.save(customer);
//        for(int x = 0; x < customers.size(); x++){
//            Customer c = customers.get(x); //for eac
// ne
// topic
//            if(c.getName().equals(name)){ //compare to what is passed in
//                customers.set(x,customer); //topic from parameter passed in
//            }
//        }
    }


    public void deleteCustomer(Long id){
        customerRepository.delete(id);
//        for(int x = 0; x < customers.size(); x++){
//            Customer customer = customers.get(x);
//            if(customer.getName().equals(name)){
//                customers.remove(x);
//            }
//        }
        //topics.removeIf(t-> t.getId().equals(id));
    }


}
