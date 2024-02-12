package BehavioralPatterns.ChainofResponsability;


public class ConcreteHandler1 extends Handler {//concrete handler
    public void handleRequest(Request request){    //override the method
        if(request.getValue()<0){//if request is eligible handle it
            System.out.println("Hendled by handler1");
        }
        else{//otherwise send it to the next handler
            successor.handleRequest(request);//pass the request
        }
    }

    
}
