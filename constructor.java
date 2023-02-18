
//package constructor;

public class constructor {

   
    public static void main(String[] args) {
        
        Bicycle bike = new Bicycle(0, 0, 1);
        bike.printStates();
        bike.setCadence(20);
        bike.setGear(2);
        bike.speedUp(10);
        bike.printStates();
        
        
    }
    
}
class Bicycle {
    public int cadence;
    public int gear;
    public int speed;
    
     public Bicycle(int startCadence, int startSpeed, int startGear){
         gear = startGear;
         cadence = startCadence;
         speed = startGear;
     }
      public void setCadence(int newValue){
          cadence = newValue;
         }
      public void setGear(int newValue){
          gear = newValue;
      }
      public void applyBrakes(int decrement){
         speed -=decrement;
      }
      public void speedUp(int increment){
          speed+=increment;
      }
      public void printStates(){
          System.out.println("cadence:" +cadence +  "  speed:" + speed + "  gear:" +gear);
      }
}
