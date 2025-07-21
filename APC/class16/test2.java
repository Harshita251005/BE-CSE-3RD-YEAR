import java.io.*;

class test2 {
    public static void main(String[] args) throws IOException {
        // Create directory
        File dir = new File("printwriter");
        dir.mkdir(); // Create the directory if it does not exist

        // Create file inside the directory
        File file = new File(dir, "file1.txt");
        file.createNewFile(); // Create the file if it does not exist

        // Write to file using PrintWriter
        PrintWriter pw = new PrintWriter(file); // Pass the file to PrintWriter
        pw.println("Hello, World!"); // Write a line to the file
        pw.println("This is a test file."); // Write another line
        pw.print(100); // Write a number
        pw.close(); // Close the PrintWriter

        // Read from the file using BufferedReader
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line); // Print each line to the console
        }
        br.close(); // Close the BufferedReader
    }
}
