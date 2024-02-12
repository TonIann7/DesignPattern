public class ConcreteColleague1 implements Colleague { //classe concreta che implementa l'interfaccia Colleague
    private Mediator mediator;  //collegamento con il Mediator

    public ConcreteColleague1(Mediator mediator){ //costruttore
        this.mediator = mediator; //imposta il Mediator
    }

    public void sendMessage(String message){ //invia il messaggio
        mediator.sendMessage(message, this); //invia il messaggio al Mediator
    }

    public void receiveMessage(String message){ //riceve il messaggio
        System.out.println("ConcreteColleague1 received: " + message); //stampa il messaggio ricevuto
    }


}
