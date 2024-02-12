public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator(); //crea il Mediator
        Colleague colleague1 = new ConcreteColleague1(mediator); //crea il primo Colleague
        Colleague colleague2 = new ConcreteColleague2(mediator); //crea il secondo Colleague
        mediator.setColleague1(colleague1); //imposta il primo collega
        mediator.setColleague2(colleague2); //imposta il secondo collega

        colleague1.sendMessage("Hello, how are you?"); //invia un messaggio al primo collega
        colleague2.sendMessage("Fine, thank you"); //invia un messaggio al secondo collega
    }
}
