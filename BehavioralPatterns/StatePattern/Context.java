package BehavioralPatterns.StatePattern;

public class Context implements State{
    private State state;

    public void setState(State state){ //metodo setter
this.state = state;
    }
    public State getState(){ //metodo getter
        return this.state;
    }

    public void doAction(){ //override del metodo dell'interfaccia
        this.state.doAction(); //chiamata al metodo doAction() della classe StateOne o StateTwo
    }
}
