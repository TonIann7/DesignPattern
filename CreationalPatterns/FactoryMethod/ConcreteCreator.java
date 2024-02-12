package CreationalPatterns.FactoryMethod;

public class ConcreteCreator extends Creator {

    @Override
    protected Product factoryMethod() {
      return new ConcreteProduct();
    }
    
}
