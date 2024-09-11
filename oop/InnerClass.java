public class InnerClass{
  static class LocalClass{
    private int age;
    private String name;
    public LocalClass(int age, String name) {
      this.age = age;
      this.name = name;
    }
    public int getAge() {
      return age;
    }
    public void setAge(int age) {
      this.age = age;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    
  }

  public static void main(String[] args) {
    LocalClass l=new LocalClass(10, "John");
    System.out.println(l.getAge());
    System.out.println(l.getName());
    A a =new A(10, "John Doe");
    System.out.println(a.getAge());
    System.out.println(a.getName());
    A.B b =new A.B("Inner", 100010);
    System.out.println(b.getRoll());
    System.out.println(b.getName());
  }
}

class A{
  private int age;
  private String name;
  static class B{
    private String name;
    private int roll;
    public B(String name, int roll) {
      this.name = name;
      this.roll = roll;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public int getRoll() {
      return roll;
    }
    public void setRoll(int roll) {
      this.roll = roll;
    }
    
  }
  public A(int age, String name) {
    this.age = age;
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
}

