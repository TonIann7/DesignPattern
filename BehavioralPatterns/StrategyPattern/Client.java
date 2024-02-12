package BehavioralPatterns.StrategyPattern;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        context = new Context(new ConcreteStrategyB());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        context = new Context(new ConcreteStrategyC());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
