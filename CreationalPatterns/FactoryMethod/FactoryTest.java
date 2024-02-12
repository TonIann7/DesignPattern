package CreationalPatterns.FactoryMethod;

public class FactoryTest {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        creator.doSomething();
    }
}
