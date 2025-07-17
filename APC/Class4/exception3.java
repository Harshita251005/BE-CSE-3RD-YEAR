import java.io.FileReader;
import java.io.FileNotFoundException;

public class exception3 {
    public static void main(String[] args) {
        try {
            // NullPointerException
            String s = null;
            System.out.println(s.length()); // Will throw NullPointerException

            // NumberFormatException
            int a = Integer.parseInt("ten"); // Will throw NumberFormatException
            System.out.println(a);

            // ArrayIndexOutOfBoundsException
            int[] arr = new int[5];
            arr[6] = 5; // Will throw ArrayIndexOutOfBoundsException
            System.out.println(arr[6]);

            // FileNotFoundException
            FileReader fr = new FileReader("wasif.txt"); // Checked exception

        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred");
        } catch (NumberFormatException e) {
            System.out.println("Number format exception occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

// This code demonstrates various exceptions in Java and how to handle them using try-catch blocks.
// It includes examples of NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, and FileNotFoundException.
// Each exception is caught and a corresponding message is printed to the console.
// The code also shows how to handle checked exceptions like FileNotFoundException, which requires a try-catch block or a throws declaration.

//outpu : Null pointer exception occurred because the string is null, Because the exception occurs at s.length(), and the rest of the try block is skipped.