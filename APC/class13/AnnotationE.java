import java.util.ArrayList;

@FunctionalInterface
interface Interf {
    public void m1(); // Only one abstract method
}

class Test1 extends AnnotationE {

    @Override
    public void lastYearTaxFileDeduction() {
        System.out.println("Overridden method from parent class");
    }

    @Deprecated
    public void show() {
        System.out.println("Deprecated method");
    }

    @SuppressWarnings("unchecked")
    ArrayList ar = new ArrayList(); // raw type, warning suppressed
}

public class AnnotationE {
    public void lastYearTaxFileDeduction() {
        System.out.println("Original method in parent class");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.lastYearTaxFileDeduction();
        t.show(); // Will show strike-through warning in IDE
    }
}

// The code demonstrates the use of annotations in Java, including @FunctionalInterface, @Deprecated, and @SuppressWarnings.
// It defines a functional interface, overrides a method in a subclass, and suppresses warnings for
// using raw types in a collection. The main method shows how to call these methods and illustrates the use of annotations.
