public class Client {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementor1();
        Abstraction abstraction = new AbstractionImp(implementor);
        abstraction.doOperation();
        implementor = new ConcreteImplementor2();
        abstraction = new AbstractionImp(implementor);
        abstraction.doOperation();
    }
}
