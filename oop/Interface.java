
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
  }
}

interface Car {

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

    public void beep(){
      System.out.println("BEEP");
    }
}

class Nexon extends CNGCar implements ElectricCar, EngineCar {

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


