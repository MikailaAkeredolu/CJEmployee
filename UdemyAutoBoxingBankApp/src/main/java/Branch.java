import java.util.ArrayList;

/**
 * Created by makerofapps on 12/5/17.
 */
public class Branch {

    private String name;

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private ArrayList<Customer> customers;


    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();

    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialAmount));  //calling constructor
            return true;
        }
        return false;
    }


    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransacetions(amount);
            return true;
        }
        return false;
    }


    private Customer findCustomer(String customerName){
        for(int x = 0; x < this.customers.size(); x++){
            Customer checkedCustomer = this.customers.get(x);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }



}
