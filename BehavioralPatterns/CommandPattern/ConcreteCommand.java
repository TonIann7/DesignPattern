

public class ConcreteCommand implements Command {//implementazione della classe astratta
    private Receiver state;//stato
    public ConcreteCommand(Receiver state){//costruttore
        this.state=state;//setta lo stato
    }
    public void execute(){//metodo per eseguire il comando
        state.action();//esegue l'azione(receiver.action())
    }
}
