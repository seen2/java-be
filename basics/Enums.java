
import java.util.Scanner;

public class Enums {

    public static void main(String[] args) {
        System.err.println("Pricings");
        Laptops laps[] = Laptops.values();
        for (Laptops l : laps) {
            System.out.println(l.ordinal() + 1 + "." + l + ": " + l.getPrice());
        }
        String name;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please Enter name");
            name = sc.nextLine().toUpperCase();
        }catch(Exception e){
          name="";
          System.out.println(e.getMessage()+", "+e.getClass());
        }
        switch (Laptops.valueOf(name)) {
            case Laptops.DELL:
                System.out.println(Laptops.DELL.getPrice());
                System.out.println("Thank you");
                break;
                case Laptops.MACBOOK:
                System.out.println(Laptops.MACBOOK.getPrice());
                System.out.println("Thank you");
                break;
                case Laptops.PC:
                System.out.println(Laptops.PC.getPrice());
                System.out.println("Thank you");
                break;
                default:
                System.out.println("Invalid choice");
                System.out.println("Thank you");
                throw new AssertionError();
        }
        switch (Laptops.valueOf(name)) {
          case Laptops.DELL -> System.out.println(Laptops.DELL.getPrice());
          case Laptops.MACBOOK -> System.out.println(Laptops.MACBOOK.getPrice());
          case Laptops.PC -> System.out.println(Laptops.PC.getPrice());
          default -> throw new AssertionError();
      }
    }
}

enum Laptops {

    MACBOOK(1000), PC(700), DELL(500);

    private double price;

    Laptops(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

}
