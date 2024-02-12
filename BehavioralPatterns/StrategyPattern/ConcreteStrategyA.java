package BehavioralPatterns.StrategyPattern;

public class ConcreteStrategyA implements IStrategy{ //implementazione concreta di Strategy
 public int behaviorInterface(int num1, int num2){ //override del metodo behaviorInterface
  return num1 + num2; //somma
 }    
}
