import java.util.TreeSet;

public class TreeSetE {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);
        ts.add(1);
        ts.add(5);
        ts.add(7);
        ts.add(3);
        
        System.out.println("TreeSet (sorted): " + ts); // Sorted automatically
        ts.add(null); // This will throw a NullPointerException
        System.out.println("After adding null: " + ts);
        
    }
}
