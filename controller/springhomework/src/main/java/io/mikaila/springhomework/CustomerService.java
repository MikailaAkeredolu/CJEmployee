package io.mikaila.springhomework;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer>customers = new ArrayList<>(Arrays.asList(
            new Customer("Mike", 23,"100 charming street"),
            new Customer("Jones", 21,"100 charming street")
    ));

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomer(String name){
        for(int x = 0; x < customers.size(); x++){
            Customer customer = customers.get(x);

            if(customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
        //return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void updateCustomer(String name, Customer customer){
        for(int x = 0; x < customers.size(); x++){
            Customer c = customers.get(x); //for each topic
            if(c.getName().equals(name)){ //compare to what is passed in
                customers.set(x,customer); //topic from parameter passed in
            }
        }
    }


    public void deleteCustomer(String name){
        for(int x = 0; x < customers.size(); x++){
            Customer customer = customers.get(x);
            if(customer.getName().equals(name)){
                customers.remove(x);
            }
        }
    }


}
