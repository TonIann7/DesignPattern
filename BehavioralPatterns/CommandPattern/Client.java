

public class Client {
    public static void main(String[] args) {//classe main
        Receiver receiver = new Receiver();//istanza di receiver
        Command command = new ConcreteCommand(receiver);//istanza di command
        Invoker invoker = new Invoker();//istanza di invoker
        invoker.setCommand(command);//setta il comando
        invoker.pressButton();//preme il bottone(esegue l'azione)
    }
}
