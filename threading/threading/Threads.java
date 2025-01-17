package threading;

public class Threads  {

    public static void main(String[] args) {
        B b = new B();
        A a = new A();

        // Non thread
        // b.show();
        // a.show();
        //Thread
        b.setPriority(Thread.MAX_PRIORITY);
        a.setPriority(Thread.MIN_PRIORITY);
        a.start();
        b.start();
        // System.out.println(a.getPriority());
        // System.out.println(b.getPriority());
        // System.out.println(Thread.currentThread().getPriority());
       
    }

}

class A extends Thread {

  @Override
  public void run(){
    this.show();
  }

    public void show() {
        for (int i = 0; i < 1; i++) {
          try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
  @Override
  public void run(){
    this.show();
  }
    public void show() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Hello");
           
        }
    }
}
