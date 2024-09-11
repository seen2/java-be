package paie;


public class Abstraction {

  public static void main(String[] args) {

    Benz b = new Benz();
    b.drive();
    b.horn();

  }
}
//abstract class
abstract class Car {

    public abstract void drive();

    public void horn(){
      System.out.println("horn");
    }
}

class Benz extends Car {

    @Override
    public void drive() {
      System.out.println("Driving Benz...");
    }
}


