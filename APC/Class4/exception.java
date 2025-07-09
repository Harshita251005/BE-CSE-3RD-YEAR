import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exception {
    public static void main(String[] args) {
        try{
            m1();
        }
        catch(FileNotFoundException e){
            System.out.println("incorrect file name");
        }

    }
    
        // public static void m1() throws ArithmeticException 
        // {
        //    System.out.println(10/0);   
        // }
// Output: Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at exception.m1(exception.java:8)

public static void m1() throws FileNotFoundException 
    {
    FileReader fr = new FileReader("wasf.txt");
    }
}