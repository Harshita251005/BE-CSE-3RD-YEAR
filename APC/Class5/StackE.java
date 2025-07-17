import java.util.Stack;

public class StackE{
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        s.push("E");

        System.out.println(s);              // [A, B, C, D, E]
        System.out.println(s.pop());        // E (removes top)
        System.out.println(s);              // [A, B, C, D]
        System.out.println(s.peek());       // D (top but not removed)
        System.out.println(s);              // [A, B, C, D]
        System.out.println(s.search("A"));  // 4 (position from top, 1-based)
        System.out.println(s.search("X"));  // -1 (not found)
    }
}

