/**
 * Created by makerofapps on 11/29/17.
 */
public class Mitsubishi extends Car {

    public Mitsubishi(int cylinder, String name){
        super(cylinder, name);

    }

    @Override
    public String startEngine() {
        return "Mistibushi => startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mistibushi => accelerate()";
    }

    @Override
    public String brake() {
        return "Mistibushi => brake()";
    }
}
