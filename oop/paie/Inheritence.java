package paie;

public class Inheritence {

    public static void main(String[] args) {
        Man m = new Man();
        m.speak();
        System.out.println(m.getName());
        m=new Man("Some Man");
        m.speak();
        System.out.println(m.getName());
    }
}

class Anamalia {

    private String name="Anamalia";

    public Anamalia() {
    }

    public Anamalia(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void speak() {
        System.out.println("Anamalia Speaking");
    }
}

class Human extends Anamalia {

    public String name = "Human";

    public Human() {
      super();
    }

    public Human(String n) {
        super(n);
    }

    @Override
    public void speak() {
        System.out.println("Human Speaking");
    }
}

class Man extends Human {

    @SuppressWarnings("unused")
    private String name = "Man";//it's hidden until getName overrides
    public Man() {
      super();
    }

    public Man(String n) {
        super(n);
    }

    @Override
    public void speak() {
        System.out.println("Man Speaking");
    }
}
