import java.io.*;

class test1 {
    public static void main(String[] args) throws IOException {
        // Create directory
        File dir = new File("bufferwriter");
        dir.mkdir(); // Create the directory if it does not exist

        // Create file inside the directory
        File file = new File(dir, "file1.txt");
        file.createNewFile(); // Create the file if it does not exist

        // Write to the file using BufferedWriter
        FileWriter fw = new FileWriter(file, true); // Append mode
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello, World!");
        bw.newLine(); // Add a new line
        bw.write("This is a test file.");
        bw.newLine();
        bw.close(); // Close the BufferedWriter

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
