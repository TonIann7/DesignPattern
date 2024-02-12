package CreationalPatterns.PrototypePattern;

public class client {
    public static void main(String[] args) {
        ConcretePrototype1 obj1= new ConcretePrototype1();
        obj1.print();
        ConcretePrototype1 obj3 = (ConcretePrototype1)obj1.clone();
        obj3.print();
    }
    
}
