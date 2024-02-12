package BehavioralPatterns.ObserverPattern;

public interface Observable { //interfaccia Observable (osservabile) Subject
    void registerObserver(Observer observer); //metodo per registrare un osservatore
    void removeObserver(Observer observer); //metodo per rimuovere un osservatore
    void notifyObservers(); //metodo per notificare gli osservatori
}
