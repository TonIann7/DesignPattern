

public class FlyweightClient {
    public static void main(String[] args) {
        FlyweightFactory facotry = new FlyweightFactory();
        Flyweight flyweight = facotry.getFlyweight("state");
        flyweight.doOperation("Hello");

        flyweight = facotry.getFlyweight("state");
        flyweight.doOperation("World");

        flyweight = facotry.getFlyweight("state1");   
        flyweight.doOperation("!");
    }
}
