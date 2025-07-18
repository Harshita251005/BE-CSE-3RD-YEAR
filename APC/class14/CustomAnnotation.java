import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;

// Define custom annotation
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String calling() default "video call";
    int version() default 10;
}

// Apply annotation to class (no need to make it public if in same file)
@SmartPhone
class Test {
    int model = 123;
}

// Main class
public class CustomAnnotation {
    public static void main(String[] args) {

        Test t = new Test();
        System.out.println("Model: " + t.model);

        Class<?> c = t.getClass();

        // Get annotation if present
        if (c.isAnnotationPresent(SmartPhone.class)) {
            SmartPhone s = c.getAnnotation(SmartPhone.class);
            System.out.println("Calling Feature: " + s.calling());
            System.out.println("Version: " + s.version());
        } else {
            System.out.println("SmartPhone annotation not present.");
        }
    }
}
