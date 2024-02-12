package CreationalPatterns.SingletonPattern;

public class SingletonTest {
    public static void main(String[] args) {
        LazyInitializationSingleton lsingleton = LazyInitializationSingleton.getInstance();
        lsingleton.print();
        EagerSingleton esingleton = EagerSingleton.getInstance();
        esingleton.printEager();
    
        


    }
}
