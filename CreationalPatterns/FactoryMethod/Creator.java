package CreationalPatterns.FactoryMethod;

public abstract class Creator {
    public void doSomething(){
        Product product = factoryMethod();
    }
    protected abstract Product factoryMethod();
}
