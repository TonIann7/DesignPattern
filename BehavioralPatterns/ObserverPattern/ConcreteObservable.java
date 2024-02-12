package BehavioralPatterns.ObserverPattern;


import java.util.ArrayList;
import java.util.List;

class ConcreteObservable implements Observable { //classe ConcreteObservable che implementa l'interfaccia Observable
    private List<Observer> observers = new ArrayList<>(); //lista di osservatori
    private int state; //stato dell'osservabile

    public void setState(int state) { //metodo per impostare lo stato
        this.state = state;//impostazione dello stato
        notifyObservers();//notifica degli osservatori
    }

    public void registerObserver(Observer observer) {//metodo per registrare un osservatore
        observers.add(observer);//aggiunta dell'osservatore alla lista
    }

    @Override
    public void removeObserver(Observer observer) {//metodo per rimuovere un osservatore
        observers.remove(observer);//rimozione dell'osservatore dalla lista
    }

    @Override
    public void notifyObservers() {//metodo per notificare gli osservatori
        for (Observer observer : observers) { //per ogni osservatore
            observer.update(state); //notifica dell'aggiornamento
        }
    }

}