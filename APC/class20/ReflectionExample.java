import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student {

    int a;
    int b;

    public void m1() {
        System.out.println("m1 is called");
    }

    public void m2() {
        System.out.println("m2 is called");
    }
}

public class ReflectionExample {

    public static void main(String[] args) {

        Student s = new Student();
        Class<?> c = s.getClass();

        System.out.println("Class Name: " + c.getName());

        System.out.println("\nDeclared Fields:");
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("\nDeclared Methods:");
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
