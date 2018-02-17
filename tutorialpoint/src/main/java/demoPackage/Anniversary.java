package demoPackage;

/**
 * Created by makerofapps on 10/26/17.
 */
public class Anniversary {
    public String name;
    public String event;

    public Anniversary(String name, String event){
        this.name = name;
        this.event = event;
    }

    public void printIT(){
        System.out.println(name + " Thanks for planning this trip. Happy " + event);
    }
}
