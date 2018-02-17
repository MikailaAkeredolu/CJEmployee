/**
 * Created by makerofapps on 12/4/17.
 */
public class Contacts {
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //no instance needed for this method
    public static Contacts createContact(String name, String phoneNumber){
        return new Contacts(name, phoneNumber);  //calling a constructor
    }




}
