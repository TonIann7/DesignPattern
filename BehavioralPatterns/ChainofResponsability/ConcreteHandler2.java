package BehavioralPatterns.ChainofResponsability;


public class ConcreteHandler2 extends Handler {
    public void handleRequest(Request request){
        if(request.getValue()==0){
            System.out.println("Hendled by handler2");
        }else{
            successor.handleRequest(request);
        }
    }
}
