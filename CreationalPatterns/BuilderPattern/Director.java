package CreationalPatterns.BuilderPattern;

public class Director {
    private Builder builder;//reference to the builder
    public Director(Builder builder){//constructor
        this.builder=builder;//initialize the builder
    }
    public void construct(){//method to construct the product
        builder.buildpart();//  call the buildpart method of the builder
    }
    
}
