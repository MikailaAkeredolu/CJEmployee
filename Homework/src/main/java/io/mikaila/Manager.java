package io.mikaila;

/**
 * Created by makerofapps on 12/18/17.
 */
public class Manager extends Employee {

    private String managerTitle;

    public Manager(String name, double salary, String managerTitle){
        super(name, salary);
        this.managerTitle = managerTitle;
    }

    public String getManagerTitle() {
        return managerTitle;
    }

    public void setManagerTitle(String managerTitle) {
        this.managerTitle = managerTitle;
    }

}
