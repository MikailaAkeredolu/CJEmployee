import java.util.ArrayList;

/**
 * Created by makerofapps on 12/4/17.
 */
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts>myContacts = new ArrayList<Contacts>();

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();     //initialize our array list with an empty list
    }

    public boolean addNewContact(Contacts contact){
      if(findContact(contact.getName()) >= 0){
          System.out.println("Contact is already on file");
          return false;
      }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }

    private int findContact(Contacts contact){
        return this.myContacts.indexOf(contact); //return the elements position
    }

    private int findContact(String  contactName){
       //loop through and extract name and grab index position
        for(int x = 0; x < this.myContacts.size(); x++){
            Contacts contact = this.myContacts.get(x);
            if(contact.getName().equals(contactName)){
                return x;
            }
        }
        return -1; //not found
    }

    //To return the data from another method as a string
    public String queryContact(Contacts contact){
        if(findContact(contact) >= 0 ){
            return contact.getName();
        }
        return null;
    }

    //Overload query contact
    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }


    public void printContacts(){
        System.out.println("Contact List");
        for(int x = 0; x < this.myContacts.size(); x++){
            System.out.println((x + 1) + "." +
            this.myContacts.get(x).getName() + " -> " +
            this.myContacts.get(x).getPhoneNumber());
        }
    }




}
