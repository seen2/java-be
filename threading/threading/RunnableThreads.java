package threading;

public class RunnableThreads {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
        //using lambda expressions
        Runnable r1 = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Hello");
        };
        Runnable r2 = () -> {
            System.out.println("Hi");
        };
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);

        t3.start();
        t4.start();
    }
}

class A implements Runnable {

    @Override
    public void run() {
        this.show();
    }

    private void show() {
        System.out.println("Hello");
    }
}

class B implements Runnable {

    @Override
    public void run() {
        this.show();
    }

    private void show() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hi");
    }

}
