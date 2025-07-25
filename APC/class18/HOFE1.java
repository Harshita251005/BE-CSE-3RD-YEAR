import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@FunctionalInterface
interface Interf {
    void m1();
}

public class HOFE1 {

    public static void main(String[] args) {
        HOFE1 h = new HOFE1();

        // Using lambda with functional interface
        Interf i = () -> System.out.println("m1 method is used");
        h.print(i);

        // Using Function to square elements in list
        List<Integer> l = Arrays.asList(4, 3, 5, 6, 7, 8);
        Function<Integer, Integer> f = n -> n * n;
        System.out.println("Squared List: " + h.square(f, l));
    }

    // Method using Function (Higher-Order Function)
    public ArrayList<Integer> square(Function<Integer, Integer> f, List<Integer> l) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (Integer i : l) {
            ar.add(f.apply(i));
        }
        return ar;
    }

    // Method accepting functional interface
    public void print(Interf i) {
        i.m1();
        System.out.println("print method is called");
    }
}
