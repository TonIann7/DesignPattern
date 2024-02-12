package BehavioralPatterns.ChainofResponsability;


public abstract class Handler {//classe astratta
    protected Handler successor;//  protected perche' deve essere visibile alle sottoclassi

public void setSuccessor(Handler successor){//metodo per settare il successore
    this.successor=successor;//setta il successore
}
public abstract void handleRequest(Request request);//metodo astratto per gestire la richiesta
}