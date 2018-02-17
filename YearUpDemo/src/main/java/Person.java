/**
 * Created by makerofapps on 12/7/17.
 */
class Person {

    private String name ; //state
    private int age; //state
    private long socialSecurity;

    //Constructor one

    //default
    public Person(){

   }

    public Person(String name, int age, long socialSecurity){
        this.name = name;
        this.age = age;
        this.socialSecurity = socialSecurity;
    }

    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(long socialSecurity) {
        this.socialSecurity = socialSecurity;
    }



    //Constructor two
//    public Person(String name){
//        this.name = name;
//    }






//Method
    public String run(String name, int age){
        return "This returns a string";
    }
}
