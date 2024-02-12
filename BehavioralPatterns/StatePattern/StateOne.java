package BehavioralPatterns.StatePattern;

public class StateOne implements State{ //classe che implementa l'interfaccia State
    public void doAction(){ //override del metodo dell'interfaccia
        System.out.println("StateOne"); //stampa a video "StateOne"
    }
}
