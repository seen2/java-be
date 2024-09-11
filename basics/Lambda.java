public class Lambda{
  public static void main(String[] args) {
    Maths sq=x->x*x;
    System.out.println(sq.square(10));
    UI ui=(x,y)->{
      //some code
      System.out.println(""+x+y);
    };
    ui.display(10,12);
  }
}


@FunctionalInterface
interface Maths{
  int square(int x);
}

@FunctionalInterface
interface UI{
  void display(int x,int y);
}


