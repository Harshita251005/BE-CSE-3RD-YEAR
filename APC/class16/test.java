import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        File f = new File("folder1");
        f.mkdir(); //Create the directory if it does not exist
        File file = new File(f, "file1.txt");
        file.createNewFile(); // Create the file if it does not exist
        
        FileWriter fw = new FileWriter(file, true); // Open the file in append mode
        fw.write("Hello, World!\n"); // Write to the file
        fw.write("This is a test file.\n"); // Write another line

        fw.flush();

        FileReader fr = new FileReader(file); // Open the file for reading
        // System.out.println((char)fr.read()); // Read and print the contents of the file
        System.out.println(fr.read()); 
        int i;
        while ((i = fr.read()) != -1) { // Read until the end of the file
            System.out.print((char) i); // Print each character
        }
        // fr.close(); // Close the FileReader
        // fw.close(); // Close the FileWriter
        // file.delete(); // Delete the file after use
        // f.delete(); // Delete the directory after use
        // System.out.println("\nFile operations completed successfully.");
        // Note: Ensure that the file and directory are not in use before deleting them.
        // This code will create a directory, create a file in it, write to the file
        // read from the file, and then delete both the file and the directory.
        // Make sure to handle exceptions properly in production code.
        // This is a simple demonstration of file operations in Java.
    }
}