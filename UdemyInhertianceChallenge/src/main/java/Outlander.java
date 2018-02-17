/**
 * Created by makerofapps on 11/26/17.
 */
public class Outlander extends Car {
    private int roadService;

  public Outlander(int roadService){
      super("Out lander","4wd",5,5,6,false);
      this.roadService = roadService;
  }

  public void accelerate(int rate){
      int newVelocity = getCurrentVelocity() + rate;
      if(newVelocity == 0){
          stop();
          changeCurrentGear(1);
      }else if(newVelocity > 0 && newVelocity <= 10){
        changeCurrentGear(1);
      }else if(newVelocity > 10 && newVelocity <= 20){
          changeCurrentGear(2);
      }else if(newVelocity > 20 && newVelocity <= 30){
        changeCurrentGear(3);
    }else {
          changeCurrentGear(4);
      }

      if(newVelocity > 0){
          changeVelocity(newVelocity, getCurrentDirection());
      }

  }




}
