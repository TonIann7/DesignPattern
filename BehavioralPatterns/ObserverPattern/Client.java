package BehavioralPatterns.ObserverPattern;

public class Client {
    public static void main(String[] args) {
        ConcreteObservable observable = new ConcreteObservable(); //creazione di un osservabile ovvero di un array di osservatori
        ConcreteObserver observer1 = new ConcreteObserver(); //creazione di un osservatore
        ConcreteObserver observer2 = new ConcreteObserver(); //creazione di un osservatore
        observable.registerObserver(observer1); //registrazione dell'osservatore
        observable.registerObserver(observer2);//registrazione dell'osservatore

        observable.setState(1); //impostazione dello stato
        observable.notifyObservers(); //notifica degli osservatori
    }
}
