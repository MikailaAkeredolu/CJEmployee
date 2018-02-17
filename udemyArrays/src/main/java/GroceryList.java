import java.util.ArrayList;

/**
 * Created by makerofapps on 12/4/17.
 */

//Resizing arrays - not good so we use an Array List
    //As elements are added to an arrays list it's capacity increases


public class GroceryList {


    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }


    //Add an item
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    //Print List
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for(int x = 0 ; x < groceryList.size(); x++){
            System.out.println((x+1) + "." + groceryList.get(x));
        }
    }



    public  void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifryGoceryItime(position, newItem);
        }
    }

    //Replace an item at that position

    private void  modifryGoceryItime(int position, String newItem){
            groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position+1) + " has been modified ");

    }

    public void removeGrioceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
           removeGrioceryItem(position);
        }
    }

    //Remove an item
    private void removeGrioceryItem(int position){
        groceryList.remove(position);

    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }
        return  false;
    }

    //Find
    private int findItem(String searchItem){

        return groceryList.indexOf(searchItem);

       // boolean exists = groceryList.contains(searchItem);

//        int position = groceryList.indexOf(searchItem);
//        if(position >= 0){
//            return groceryList.get(position);
//        }
//        return null;

    }

}
