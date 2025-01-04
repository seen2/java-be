/*
 Write a Java program to define a class with attributes and methods.
Write a Java program to create an object of a class and call its methods.
Write a Java program to define a class with constructors.
Write a Java program to define a class with inheritance.
Write a Java program to define a class with polymorphism.
Write a Java program to demonstrate the use of inheritance.
Write a Java program to demonstrate the use of method overriding.
Write a Java program to demonstrate the use of method overloading.
Write a Java program to demonstrate the use of constructor chaining.
Write a Java program to demonstrate the use of abstract classes and methods.
Write a Java program to demonstrate the use of method overriding.
Write a Java program to demonstrate the use of method overloading.
Write a Java program to demonstrate the use of operator overloading.
Write a Java program to demonstrate the use of function polymorphism.
Write a Java program to demonstrate the use of template polymorphism.
 */

 public class Exc {
  public static void main(String[] args) {

    Human h = new Human("Human");
    h.speak();
    System.out.println(h.getName());

    Man m = new Man("John");
    m.speak();
    System.out.println(m.getName());

    Woman w = new Woman("Janet");
    w.speak();
    System.out.println(w.getName());

    Man m1 = new Man("John", "Male");
    m1.speak();
    System.out.println(m1.getName());

    m1 = new Man("Patrick", "Male");
    m1.show("s");
    m1.speak(12);

  }
}

class Human extends Animalia {
  private String name;

  public Human(String n) {
    this.name = n;
  }

  @Override
  public void speak() {
    System.out.println("Human Speaking");
  }

  public void speak(String s) {
    System.out.println("Human Speaking"+s);
  }
  //function polymorphism.
  public void speak(int age) {
    System.out.println("Human Age is "+age);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String n) {
    this.name = n;
  }
}

class Man extends Human {
  private final String gender;
  public Man(String n) {
    super(n);
    this.gender = "Male";
  }

  public Man(String n, String g) {
    super(n);
    this.gender = g;
  }

  @Override
  public void speak() {
    System.out.println("Man Speaking");
  }

  @Override
  public void speak(String s) {
    System.out.println("Man Speaking"+s);
  }

  public String getGender() {
    return this.gender;
  }

}

class Woman extends Human {
  public Woman(String n) {
    super(n);
  }

  @Override
  public void speak() {
    System.out.println("Woman Speaking");
  }

  @Override
  public void speak(String s) {
    System.out.println("Woman Speaking"+s);
  }
}

abstract class Animalia{
  public abstract void speak();

  //template polymorphism.
  public <T> void show(T s) {
    System.out.println("Animal showing"+s);
  }
}