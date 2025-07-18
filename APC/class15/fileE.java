
import java.io.File;
import java.io.IOException;
public class fileE {
    public static void main(String[] args) throws IOException{
		
		
		File f = new File("abc.txt");
//		System.out.println(f.exists());
		
		f.createNewFile();
		System.out.println(f.exists());
		
		File f1 = new File("wasif.txt");
		f1.createNewFile();
		
		
		System.out.println(f1.getAbsolutePath());
		f1.delete();
		
		File f2 = new File("Java");
		f2.mkdir();
		 
		
		File f3 = new File(f2,"java.txt");
		f3.createNewFile();
		
		File f4 = new File(f2,"c++.txt");
		f4.createNewFile();

		
		
	}

}
