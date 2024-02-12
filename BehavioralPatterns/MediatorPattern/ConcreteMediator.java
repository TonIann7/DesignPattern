public class ConcreteMediator implements Mediator { //classe concreta che implementa l'interfaccia Mediator
   private Colleague colleague1; //collegamento con il primo collega
   private Colleague colleague2;//collegamento con il secondo collega
   
   public void setColleague1(Colleague colleague){
    this.colleague1 = colleague;       //imposta il primo collega
   }

   public void setColleague2(Colleague colleague){
    this.colleague2 = colleague; //imposta il secondo collega
   }

   public void sendMessage(String message,Colleague originator){ //invia il messaggio al collega
    if(originator==colleague1){ //se il mittente è il primo collega
        colleague2.receiveMessage(message); //invia il messaggio al secondo collega
    }else {
        colleague1.receiveMessage(message); //altrimenti invia il messaggio al primo collega
    }
   }
}
