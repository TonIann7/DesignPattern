package BehavioralPatterns.StrategyPattern;

public class ConcreteStrategyB implements IStrategy { //implementazione concreta di Strategy
    public int behaviorInterface(int num1, int num2){ //override del metodo behaviorInterface
    return num1 - num2; //sottrazione
    }
}
