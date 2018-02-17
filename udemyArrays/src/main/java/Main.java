import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by makerofapps on 11/22/17.
 */


public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();

        while (!quit) {
            System.out.println("\n Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShuttting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                addNewContact();
                break;
                case 3:
                updateContact();
                break;
                case 4:
                removeContact();
                break;
                case 5:
                queryContact();
                case 6:
                printActions();
                break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new Contact Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();

        Contacts newContact = Contacts.createContact(name, phone);

        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New Contact Added: nmae = " + name + ", phone = " + phone);
        }else{
            System.out.println("cannot add , " + name + " already on file");
        }
    }


    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact  = Contacts.createContact(newName,newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error updating record");
        }

    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if( mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully updated contact");
        }else{
            System.out.println("Error updating contact");
        }

    }



    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + "Phone number: " + existingContactRecord.getPhoneNumber());
    }



    private static void startPhone() {
        System.out.println("Starting phone ...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact exist\n" +
                "6 - to print a list of available actions");
        System.out.println("Choose your action");


    }
}





/*
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.println("enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;

            }

        }
    }


    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t0 - To Print choice options ");
        System.out.println("\t1 - To Print the list of grocery items ");
        System.out.println("\t2 - To add an item to the list ");
        System.out.println("\t3 - To modify an item in the list ");
        System.out.println("\t4 - To remove an item from the list ");
        System.out.println("\t5 - To search for an item in the list ");
        System.out.println("\t6 - To quit the application ");

    }

    //add item method

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter a item name: ");
        String itemNo = scanner.nextLine();

        System.out.print("enter replacement item : ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem); //index 0
    }


    public static void removeItem() {
        System.out.print("Enter a number: ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGrioceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.print("Item to search for : ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in shopping list");
        }
    }

    //Copy one array list to another

    public static void processArrayList(){
        //This way
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        //or This way
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());


        //or This way to convert it to a regular array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);





//        String str = new String("This is a BeginnersBook tutorial");
//        System.out.println(str.indexOf("t"));
*/


        /*

        int[] myArray = getIntegers(5);

        for(int x= 0; x < myArray.length; x ++){
            System.out.println("element " + x + ": " + "value is " + myArray[x]);
        }

       //sortArray();

    }


    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " int values \r");
        int[] values = new int[number];

        for (int x = 0; x < values.length; x++){
            values[x] = scanner.nextInt();
        }
        return values;
    }


    */

   // }

//}


