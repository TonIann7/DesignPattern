package BehavioralPatterns.ChainofResponsability;


public class client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h3 = new ConcreteHandler3();

        h1.setSuccessor(h3);
Request request = new Request("Richiesta", 0);
h1.handleRequest(request);    
}
}
