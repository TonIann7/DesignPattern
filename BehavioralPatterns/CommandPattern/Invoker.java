public class Invoker {
    private Command command;//comando

    void setCommand(Command command){//metodo per settare il comando
        this.command = command;//setta il comando essendo privato
    }

    void pressButton(){//metodo per premere il bottone
        command.execute();//esegue il comando
    }
}
