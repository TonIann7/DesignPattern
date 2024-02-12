package CreationalPatterns.FactoryPattern;

public class client {
    public static void main(String[] args){
        Product product1 = Factory.createProduct("1");
        product1.draw();
    }
}
