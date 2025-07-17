import java.util.ArrayList;
import java.util.Collection;

public class collection{
    public static void main(String[] args) {
        
        Collection<String> collection1 = new ArrayList<>(); 
        Collection<String> collection2 = new ArrayList<>(); 

        //  1. add()
        collection1.add("Apple");
        collection1.add("Banana");
        collection1.add("Cherry");
        collection2.add("Banana");
        collection2.add("Dates");


        System.out.println("After add(): " + collection1);
        collection1.add(null);
        collection1.add(null);
        System.out.println("After adding null: " + collection1); // we can add null values multiple times

        collection1.remove("Cherry");
        System.out.println("After remove(): " + collection1); // removing an element that is cherry

        collection1.remove(null); // removing null
        collection1.remove(null); // removing null

        System.out.println("After removing null: " + collection1); 


        collection1.addAll(collection2); // adding collection2 to collection1
        System.out.println("After addAll(): " + collection1); // collection2 is empty


        collection1.removeAll(collection2); // removing all elements of collection2 from collection1
        System.out.println("After removeAll(): " + collection1); // collection2 is empty


          // 5. contains(Object obj)
        System.out.println("Contains 'Apple'? " + collection1.contains("Apple"));

       // 6. containsAll(Collection c)
        System.out.println("Contains all from collection2? " + collection1.containsAll(collection2));

        // 7. retainAll(Collection c)
        collection1.add("Banana");
        collection1.add("Dates");
        collection1.retainAll(collection2);
        System.out.println("After retainAll(): " + collection1);

       // 8. clear()
        collection1.clear();
        System.out.println("After clear(): " + collection1);

        // 9. isEmpty()
        System.out.println("Is collection1 empty? " + collection1.isEmpty());

    }
}
