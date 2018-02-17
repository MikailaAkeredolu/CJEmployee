import javax.xml.transform.dom.DOMLocator;
import java.util.ArrayList;

/**
 * Created by makerofapps on 12/5/17.
 */
public class Customer {


    private String name;

    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();

        addTransacetions(initialAmount);

    }

    public void addTransacetions(double amount){
        this.transactions.add(amount);
    }


    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
