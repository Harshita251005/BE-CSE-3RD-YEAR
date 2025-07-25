class Phone {

    public void calling() {
        System.out.println("I am calling");
    }

}

class Iphone {

    Phone p;

    public Iphone(Phone p) {
        this.p = p; // dependency injection
    }

    public void security() {
        System.out.println("I am secured");
        p.calling();
    }

}

public class dependency {

    public static void main(String[] args) {

        Phone p = new Phone();      // creating Phone object
        Iphone i = new Iphone(p);   // injecting dependency into Iphone

        i.security();               // calling method
    }

}
