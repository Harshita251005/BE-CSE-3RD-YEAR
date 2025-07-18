import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileEx {
    public static void main(String[] args) throws IOException{
		
		File f = new File("abc.txt");
		System.out.println(f.exists());
		
		FileWriter fw = new FileWriter(f,true);
		fw.write("Hello Programming\n");
		fw.write("Wasif\n");
//		fw.write(1000);
		fw.write("1000\n");
		
		char[] ch = {'a','b','c'};
		fw.write(ch);
		fw.flush();
		
	}
}
