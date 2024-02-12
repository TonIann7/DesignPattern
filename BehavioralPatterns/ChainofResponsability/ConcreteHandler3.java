package BehavioralPatterns.ChainofResponsability;


public class ConcreteHandler3 extends Handler{
    public void handleRequest(Request request)
{ if(request.getValue()>0){
    System.out.println("hanlded by handler3");
}else if(successor == null){
    System.out.println("end of chain");
}

}}
