/**
 * Created by makerofapps on 11/29/17.
 */
public class Main {

        public static void main(String[] args) {
            Car car = new Car(8, "Base Car");
            System.out.println(car.startEngine());
            System.out.println(car.accelerate());
            System.out.println(car.brake());

            Mitsubishi mitsubishi = new Mitsubishi(6, "outlander 4WD");
            System.out.println(mitsubishi.startEngine());
            System.out.println(mitsubishi.accelerate());
            System.out.println(mitsubishi.brake());


            Ford ford = new Ford(6, "Falcon");
            System.out.println(ford.startEngine());
            System.out.println(ford.accelerate());
            System.out.println(ford.brake());

        }

}
