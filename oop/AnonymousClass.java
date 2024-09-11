
public class AnonymousClass {

    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void show() {
                System.out.println("Anonymous class");
            }

            @Override
            public void beep() {
                System.out.println("BEEP");
            }
        };
        a.show();
        a.beep();
        B b = new B() {
            @Override
            public void show() {
                System.out.println("B Interface");
            }
        };
        b.show();
        // lamda expression
        B bl = () -> {
            System.out.println("B Interface");
        };
        bl.show();
    }
}

abstract class A {

    abstract void show();

    abstract void beep();

    public void stop() {
        System.out.println("Stop");
    }
}

interface B {

    void show();
}
