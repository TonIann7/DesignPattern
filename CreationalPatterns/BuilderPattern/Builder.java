package CreationalPatterns.BuilderPattern;

public abstract class Builder {     //abstract class Builder
    abstract void buildpart();//abstract method to build the product
    abstract product getResult();//abstract method to get the product
}
