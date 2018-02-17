import java.util.ArrayList;

/**
 * Created by makerofapps on 12/5/17.
 */
public class Bank {
    private String name;
    private ArrayList<Branch>branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }


    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }


    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName, initialAmount);  //calling branch class
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName,amount); //calling branch class
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for(int x = 0; x < this.branches.size(); x++){
            Branch checkedBranch = this.branches.get(x);
            if(checkedBranch.getName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchNAme, boolean showTransactions){
        Branch branch = findBranch(branchNAme);
        if(branch != null){
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int x = 0; x < branchCustomers.size(); x++){
                Customer branchCustomer = branchCustomers.get(x);
                System.out.println("Customer: " +  branchCustomer.getName() + "[" + x + "]");
                if(showTransactions){
                    System.out.println("Transactions ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j = 0; j < transactions.size(); j++)
                        System.out.println("[ " + (j + 1) + "] Amount " + transactions.get(j));
                }

            }

        }
            return false;
    }





}
