import java.util.*;

@FunctionalInterface
interface DemoReference {
    public void m1();

    public static void m2() {
        System.out.println("i am from m2() method in static");
    }
}

class DemoReferenceImpl {

    public void m1() {

        System.out.println("Method 'm1' is implemented");
    }

    public static void m2() {
        System.out.println("i am from m2() method in static");
    }
}

public class MethodReference {
    public static void main(String[] args) {
        // DemoReference d = () -> System.out.println("i am from m1() method");
        // d.m1();

        // DemoReferenceImpl demo = new DemoReferenceImpl();

        DemoReference demo1 = new DemoReferenceImpl()::m1;
        demo1.m1();

        DemoReference d = DemoReferenceImpl::m2;

        // d.m2();

    }

}
