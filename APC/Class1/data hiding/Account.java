class Accounttest {
    private double balance = 5000; // instance variable means it is  a static variable  

    public double getBalance() {  
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Account {
    public static void main(String[] args) {
        Accounttest acc = new Accounttest();
        System.out.println(acc.getBalance());  // Output: 5000.0

        acc.setBalance(8000);                 
        System.out.println(acc.getBalance()); // Output: 8000.0
    }
}
// The code is structured to demonstrate the concept of data hiding in Java, where the internal state of an object is protected from direct access.
// The Accounttest class has a private field 'balance' and public methods to get and set its value.
// This ensures that the balance can only be modified through the setBalance method, enforcing(It means hiding the important data inside a class and not letting anyone outside change it directly.)encapsulation.
// The main method creates an instance of Accounttest, retrieves the initial balance, modifies it, and retrieves the new balance.
// The output will show the balance before and after modification.
