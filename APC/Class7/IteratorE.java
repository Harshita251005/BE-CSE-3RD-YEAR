import java.util.ArrayList;
import java.util.Iterator;

public class IteratorE {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(4);

        System.out.println("Original list: " + ar);

        Iterator<Integer> ai = ar.iterator();

        while (ai.hasNext()) {
            int a = ai.next();
            if (a == 3) {
                ai.remove(); // Safely remove during iteration
            } else {
                System.out.println(a);
            }
        }

        System.out.println("After iteration: " + ar);
    }
}

