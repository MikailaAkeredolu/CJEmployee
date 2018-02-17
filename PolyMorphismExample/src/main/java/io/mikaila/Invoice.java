package io.mikaila;

/**
 * Created by makerofapps on 12/19/17.
 * Imagine from the HR office perspective they want to figure out paycheck amount payable to add to their invoice
 */
public class Invoice implements Payable{

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem ){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;

    }
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }


    //Implementation of Abstract Method from Interface
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }

    //Override the toString Method
    @Override
    public String toString(){
        return getClass().getSimpleName() + " partNumber: " + getPartNumber() + " \nPartDescription: " + getPartDescription() + " \nquantity " + getQuantity() + " \nprice per item: " + getPricePerItem();
    }


}
