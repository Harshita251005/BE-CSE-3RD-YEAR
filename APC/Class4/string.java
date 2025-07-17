public class string {
    public static void main(String[] args) {
        String s = "wasif";
        String a = s.concat("Arshad");
        System.out.println(s);
        System.out.println(a);


        StringBuffer str = new StringBuffer("Wasif"); 
        str.append("arshad");
        System.out.println(str);

        StringBuilder sb = new StringBuilder("Wasif");
        sb.append("Arshad");    
        System.out.println(sb);


        String s1  = new String("wasif");
        String s2 = new String("wasif");
        System.out.println(s1 == s2); // false, because they are different objects
        System.out.println(s1.equals(s2)); // true, because they have the same content

        String s3 = "Wasif";
        String s4 = "Wasif";
        System.out.println(s3 == s4); // true, because they refer to the same string literal in the string pool
        System.out.println(s3.equals(s4)); // true, because they have the same content        
    }
}

// This code demonstrates string manipulation in Java, including concatenation, StringBuffer, StringBuilder, and string comparison.
// It shows how to create strings, append to them, and compare them using both reference equality and content equality.
// The code also illustrates the difference between using `new String()` and string literals, highlighting how Java handles string objects in memory.
// The output will show the original string, the concatenated string, the StringBuffer and StringBuilder results,
// and the results of comparing strings using both `==` and `.equals()`.

