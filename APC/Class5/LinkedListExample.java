import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
		
        System.out.println("LinkedList Example");
        System.out.println("===================================");

        // Integer LinkedList with nulls
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(null);
        ll.add(null);
        System.out.println("Integer LinkedList with nulls: " + ll);

        // String LinkedList
        LinkedList<String> linked = new LinkedList<>();
        linked.add("A");
        linked.add("B");
        linked.add("C");
        linked.add("D");
        System.out.println("Initial String LinkedList: " + linked);

        // Adding elements at the beginning and end
        linked.addFirst("E");
        linked.addLast("E"); 
        System.out.println("After addFirst and addLast: " + linked);

        // Getting first and last elements
        System.out.println("First element: " + linked.getFirst());
        System.out.println("Last element: " + linked.getLast());

        // Removing first and last elements
        linked.removeFirst();
        linked.removeLast();

        linked.add("G");
        System.out.println("After removing ends and adding G: " + linked);

        // Removing again
        linked.removeFirst();
        linked.removeLast();
        System.out.println("After removing ends again: " + linked);

        // Getting remaining first and last elements
        System.out.println("Final first element: " + linked.getFirst());
        System.out.println("Final last element: " + linked.getLast());
    }
}

