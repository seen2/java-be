package paie;

//overiding is compile time polymorphism
//overloading is runtime polymorphism
public class Polymorphism {

    public static void main(String[] args) {

        //runtime polymorphism
        //dynamic method dispatch
        //upcasting
        Anamalia a = new Human();
        a.speak();
        a = new Animal();
        a.speak();

        //downcasting
        Animal al =(Animal) a;
        al.speak();
    }
}

class Anamalia {

    private String name;

    public Anamalia() {
        this.name = "Anamalia";
    }

    public Anamalia(String n) {
        this.name = n;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Anamalia other = (Anamalia) obj;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      return true;
    }

    public void speak() {
        System.out.println("Anamalia Speaking");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Anamalia{");
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

}

class Human extends Anamalia {

    @Override
    public void speak() {
        System.out.println("Humana Speaking");
    }
}

class Animal extends Anamalia {

    @Override
    public void speak() {
        System.out.println("Animal Speaking");
    }
}
