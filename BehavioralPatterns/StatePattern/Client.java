package BehavioralPatterns.StatePattern;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(); //istanza della classe Context
        State stateOne = new StateOne(); //istanza della classe StateOne
        State stateTwo = new StateTwo(); //istanza della classe StateTwo
        context.setState(stateOne); //impostazione dello stato iniziale
        context.doAction(); //chiamata al metodo doAction() della classe StateOne
        context.setState(stateTwo); //impostazione dello stato successivo
        context.doAction(); //chiamata al metodo doAction() della classe StateTwo
    }
    
}
