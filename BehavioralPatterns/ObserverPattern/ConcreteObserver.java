package BehavioralPatterns.ObserverPattern;



public class ConcreteObserver implements Observer{ //classe ConcreteObserver che implementa l'interfaccia Observer
    private int observerState; //stato dell'osservatore

    public void update(int state) { //metodo update
        observerState = state; //aggiornamento dello stato dell'osservatore
        System.out.println("Nuovo stato dell'osservatore: " + observerState); //stampa del nuovo stato dell'osservatore
    }
}
