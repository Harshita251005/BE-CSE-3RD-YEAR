import java.util.*;

// Custom comparator to sort in descending order
class MyComparator implements Comparator<Object> {
    public int compare(Object obj1, Object obj2) {
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;

        if (i1 < i2)
            return +1;
        else if (i1 > i2)
            return -1;
        else
            return 0;
    }
}

public class ComparatorE {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>(new MyComparator());

        t.add(10); 
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);  // Duplicate, will not be added

        System.out.println(t);  // Output: [20, 15, 10, 5, 0]
    }
}

// The code defines a custom comparator to sort integers in descending order
// and uses it with a TreeSet. The TreeSet will not allow duplicates,
// so the duplicate value 20 is not added again. The final output shows the
// sorted set in descending order.
