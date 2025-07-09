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

        System.out.println("After removing null: " + collection1); // removing null


        collection1.addAll(collection2); // adding collection2 to collection1
        System.out.println("After addAll(): " + collection1); // collection2 is empty


        collection1.removeAll(collection2); // removing all elements of collection2 from collection1
        System.out.println("After removeAll(): " + collection1); // collection2 is empty

    }
}




// package G_23_03_JUL_Collection;

// import java.util.ArrayList;
// import java.util.Collection;

// public class CollectionImplementation{
//     public static void main(String[] args) {
//         // Creating two collection objects
//         Collection<String> collection1 = new ArrayList<>();
//         Collection<String> collection2 = new ArrayList<>();

// //        // 1. add(Object obj)
//         collection1.add("Apple");
//         collection1.add("Banana");
//         collection1.add("Cherry");
//         System.out.println("After add(): " + collection1);
// //
// //
// //
// //
// //
// //        // 2. addAll(Collection c)
//         collection2.add("Banana");
//         collection2.add("Dates");
//         collection1.addAll(collection2);
//         System.out.println("After addAll(): " + collection1);
// //
// //
// //
// //        // 3. remove(Object obj)
//         collection1.remove("Cherry");
//         System.out.println("After remove(): " + collection1);
// //
// //
// //
// //
// //
// //        // 4. removeAll(Collection c)
//         System.out.println(collection2);
//         System.out.println(collection1);
//         collection1.removeAll(collection2);
//         System.out.println("After removeAll(): " + collection1);
// //
// //
// //
// //
// //
// //        // 5. contains(Object obj)
//         System.out.println("Contains 'Apple'? " + collection1.contains("Apple"));
// //
// //
// //
// //
// //
// //
// //        // 6. containsAll(Collection c)
//         System.out.println("Contains all from collection2? " + collection1.containsAll(collection2));
// //
// //
// //
// //
// //
// //        // 7. retainAll(Collection c)
// //        collection1.add("Banana");
// //        collection1.add("Dates");
// //        collection1.retainAll(collection2);
// //        System.out.println("After retainAll(): " + collection1);
// //
// //
// //
// //
// //        // 8. clear()
//         collection1.clear();
//         System.out.println("After clear(): " + collection1);
// //
// //
// //
// //
// //
// //        // 9. isEmpty()
//         System.out.println("Is collection1 empty? " + collection1.isEmpty());
//     }
// }



// package G_23_03_JUL_Collection;

// import java.util.HashSet;

// public class HashSetExample {
	
// 	public static void main(String[] args) {
		
// 		HashSet<Integer> a = new HashSet<>();
// 		a.add(21);
// 		a.add(11);
// 		a.add(32);
// 		a.add(28);
// 		a.add(56);
// 		a.add(31);
// 		a.add(99);
// 		a.add(19);



// 		System.out.println(a);
// 	}

// }



// package G_23_03_JUL_Collection;

// import java.util.LinkedList;

// public class LinkedListExample {
	
// 	public static void main(String[] args) {
		
// //		LinkedList<Integer> ll = new LinkedList<>();
// //		
// //		ll.add(1);
// //		ll.add(null);
// //		ll.add(null);
// //		System.out.println(ll);
		
		
// 		LinkedList linked = new LinkedList();
//         linked.add("A");
//         linked.add("B");
//         linked.add("C");
//         linked.add("D");

//         System.out.println(linked);

// 	linked.addFirst("E");
// 	linked.addLast("E");
	
// 	System.out.println(linked);
// 	System.out.println(linked.getFirst());
// 	System.out.println(linked.getLast());
// //	
// //
//         linked.removeFirst();
//         linked.removeLast();

        
//         linked.add("G");
//         System.out.println(linked);
// //
// //        linked.removeFirst();
// //        linked.removeLast();
// //
// //        System.out.println(linked);
// //        System.out.println(linked.getFirst());
// //        System.out.println(linked.getLast());
//     }

// 	}


// package G_23_03_JUL_Collection;

// import java.util.Stack;

// public class StackExample {
	
	
// 	public static void main(String[] args) {
// 		Stack<String> s = new Stack<>();

//         s.push("A");
//         s.push("B");
//         s.push("C");
//         s.push("D");
//         s.push("E");

//         System.out.println(s);             
//         System.out.println(s.pop());        
//         System.out.println(s);             
//         System.out.println(s.peek());       
//         System.out.println(s);             
//         System.out.println(s.search("A")); 
//         System.out.println(s.search("X"));  

// 	}
      

// }