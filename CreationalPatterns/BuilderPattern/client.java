package CreationalPatterns.BuilderPattern;

public class client {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();//create the builder
        Director director = new Director(builder);//create the director
        director.construct();//call the construct method of the director
        product product = builder.getResult();//get the product from the builder
        product.print();//print the product
    }
    
}
