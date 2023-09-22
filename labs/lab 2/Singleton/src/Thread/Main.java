
package Thread;


public class Main {
    public static void main(String[] args) {
       
        ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstance();
        
        
        ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();
        
       
        if (singleton1 == singleton2) {
            System.out.println("singleton1 and singleton2 are the same instance. It's a Singleton!");
        } else {
            System.out.println("singleton1 and singleton2 are different instances. Something went wrong.");
        }
    }
}