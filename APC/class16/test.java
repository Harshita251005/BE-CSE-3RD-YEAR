import java.io.File;
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
    }
}