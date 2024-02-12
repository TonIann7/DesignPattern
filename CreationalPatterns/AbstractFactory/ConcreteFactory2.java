package CreationalPatterns.AbstractFactory;



public class ConcreteFactory2  extends AbstractFactory {
    AbstractProductA createProductA(){
        return new ProductA2("Product A2");
    }
    AbstractProductB createProductB(){
return new  ProductB2("Product B2");
    }
}
