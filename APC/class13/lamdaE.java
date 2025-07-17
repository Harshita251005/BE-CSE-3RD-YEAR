import java.util.function.Function;
import java.util.function.Predicate;

interface Interf {
    public void m1(int n);
}

class InterfImplementation implements Interf {
    public void m1(int n) {
        System.out.println("Wasif: " + n);
    }
}

public class lamdaE {
    public static void main(String[] args) {

        // Lambda for checking even/odd using custom interface
        Interf i = (int n) -> System.out.println(n % 2 == 0 ? "Even" : "Odd");
        i.m1(10);
        i.m1(5);

        // Predicate for checking even number
        Predicate<Integer> p = (n) -> n % 2 == 0;
        System.out.println("Is 10 even? " + p.test(10));
        System.out.println("Is 9 even? " + p.test(9));

        // Function for squaring a number
        Function<Integer, Integer> f = (n) -> n * n;
        System.out.println("Square of 20: " + f.apply(20));
    }
}

// The code defines a custom interface with a method to check even/odd,
// uses a lambda expression to implement it, and demonstrates the use of Predicate and Function interfaces
// from the java.util.function package to check if a number is even and to square a number, respectively.
// The main method demonstrates these functionalities with example inputs.
