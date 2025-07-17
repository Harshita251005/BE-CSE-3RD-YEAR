public class exception2 {
    public static void main(String[] args) {

        System.out.println(Integer.parseInt("10"));
        System.out.println(Integer.parseInt("ten"));
    }
}

// This code demonstrates exception handling in Java by attempting to parse an integer from a string.
// The first line successfully converts the string "10" to an integer, while the second line attempts to convert "ten",
// which will throw a NumberFormatException because "ten" is not a valid integer representation.