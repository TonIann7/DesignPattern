package CreationalPatterns.AbstractFactory;


public class client {
    public static void main(String[] args) {
        // stessa cosa di sotto AbstractFactory pf=FactoryMaker.getFactory("a");
        AbstractFactory pf=new ConcreteFactory2();
        AbstractProductA product = pf.createProductA();
    }
    
}
