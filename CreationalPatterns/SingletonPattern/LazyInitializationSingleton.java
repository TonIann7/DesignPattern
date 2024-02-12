package CreationalPatterns.SingletonPattern;

public class LazyInitializationSingleton {
   private static LazyInitializationSingleton instance;
private  LazyInitializationSingleton(){

};
public static LazyInitializationSingleton getInstance(){
    if(instance==null){
        instance = new LazyInitializationSingleton();
    }
    return instance;
}

public void print(){
    System.out.println("Hello lazy Initialization Singleton");
}
}