package BehavioralPatterns.StrategyPattern;

public class Context {
    private IStrategy strategy; //riferimento a Strategy

    public Context(IStrategy strategy){ //costruttore
        this.strategy = strategy; //inizializzazione del riferimento
    }

    public int executeStrategy(int num1, int num2){ //metodo per l'esecuzione della strategia
        return strategy.behaviorInterface(num1, num2); //invocazione del metodo behaviorInterface
    }
}
