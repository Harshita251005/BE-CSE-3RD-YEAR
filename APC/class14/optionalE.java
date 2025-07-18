import java.util.Optional;

class Test {
    private String name;
    private String email;

    public Test(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}

public class optionalE {
    public static void main(String[] args) {
        // Part 1: Using Optional with a class
        Test t = new Test("Wasif", null);
        String e = t.getEmail().orElse("Not available");
        System.out.println("Email: " + e);

        // Part 2: Optional with string
        String s = "";
        String s1 = "Wasif";
        System.out.println("Length of s1: " + s1.length());

        Optional<String> obj = Optional.ofNullable(s);
        System.out.println("Optional value: " + obj.orElse("Wasif"));
    }
}
