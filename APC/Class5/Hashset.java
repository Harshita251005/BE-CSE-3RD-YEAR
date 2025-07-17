import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
		
        // Example of using HashSet
        // HashSet does not allow duplicate elements and is unordered
        // It is implemented using a hash table
        // It allows null values but only one null value can be added
        // HashSet is not synchronized, so it is not thread-safe
        // HashSet is faster than TreeSet and LinkedHashSet for basic operations like add, remove, and contains
        // HashSet does not maintain the order of elements
		HashSet<Integer> a = new HashSet<>(); 
		a.add(21);
		a.add(21);
		a.add(32);
		a.add(28);
		a.add(56);
		a.add(31);
		a.add(99);
		a.add(19);
		System.out.println(a);
	}
}

