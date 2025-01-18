
public class Interface {
  public static void main(String[] args) {
    Nexon nexon = new Nexon();
    nexon.start();
    nexon.drive();
    nexon.stop();
    nexon.charge();
    nexon.refuel();
    nexon.refuel("petrol");
    nexon.beep();
    EngineCar c = new Nexon();
    c.beep();
    System.out.println(c.getSpeed(10));
    System.out.println(c.getSpeed(10,20));
    c.refuel();
    ((CNGCar)nexon).refuel("CNG");

    //diamond problem
    System.out.println("--------------------DIAMOND PROBLEM----------------------------");
    C c1 = new C();
    c1.beep();
    c1.bang();
    c1.callShow();
  }
}
// default methods diamond problem
interface A{

    default void beep(){
      System.out.println("A BEEP");
    }
}

@FunctionalInterface
interface B{

  void bang();
  default void beep(){
      System.out.println("B BEEP");
  }
  static void show(){
    System.out.println("B show");
  }
  static void showMore(){
    System.out.println("B show more");
  }
}

class C implements A, B{

  @Override
  public void beep() {
    A.super.beep();
  }
  @Override
  public void bang() {
    System.out.println("BANG");
  }
  public void callShow(){
    B.show();
  }

}















interface Car {

    default void beep(){
      System.out.println("CAR BEEP");
    }

    default int getSpeed(int speed){
      return speed;
    }
    default int getSpeed(int speed, int speed2){
      return speed + speed2;
    }

    abstract public void start();

    abstract public void drive();

    abstract public void stop();
}

interface ElectricCar extends Car {

    abstract void charge();
}
interface EngineCar extends Car {

    abstract void refuel();
}

abstract class CNGCar{
    abstract void refuel(String fuel);

    public void beepCng(){
      System.out.println("BEEP Cng");
    }
}

class Nexon extends CNGCar implements ElectricCar, EngineCar{

    @Override
    public void drive() {
      System.out.println("Driving...");
    }

    @Override
    public void start() {
      System.out.println("Starting...");
    }

    @Override
    public void stop() {
      System.out.println("Stopping...");
    }

    @Override
    public void charge() {
      System.out.println("Charging...");
    }

    @Override
    public void refuel() {
      System.out.println("Refueling...");
    }
    @Override
    public void refuel(String fuel) {
      System.out.println("Refueling with "+fuel);
    }

}


