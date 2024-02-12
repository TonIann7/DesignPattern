package CreationalPatterns.FactoryPattern;

public class Factory {
    public static Product createProduct(String type){
       if(type==null){
        return null;
       }
       if(type.equals("1")){
        return new ConcreteProduct();
       }
       return null;
    }
}
