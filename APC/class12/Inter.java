import java.util.function.Predicate;

// No 'public' keyword needed unless file name is Interf.java
interface Interf {
    void m1(int a);
}

class InterfImplementation implements Interf {
    public void m1(int a) {
        System.out.println("Hello, Wasif. Number: " + a);
    }
}

public class Inter {
    public static void main(String[] args) {

        // Lambda expression to print square
        Interf square = (int n) -> System.out.println("Square: " + n * n);
        square.m1(10);

        // Lambda to check even number
        Predicate<Integer> p = (a) -> a % 2 == 0;
        System.out.println("Is 10 even? " + p.test(10));
        System.out.println("Is 7 even? " + p.test(7));
    }
}

// The code defines an interface and its implementation, uses a lambda expression to print the square of a number,
// and uses a Predicate to check if a number is even. The main method demonstrates these functionalities
// with example inputs.