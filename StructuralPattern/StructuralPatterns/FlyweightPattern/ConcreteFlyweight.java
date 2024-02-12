public class ConcreteFlyweight implements Flyweight{ //classe concreta che implementa l'interfaccia Flyweight
    private String intrinsicState; //stato intrinseco
//questa classe memorizza lo stato intrinseco e lo utilizza per eseguire l'operazione richiesta
    public ConcreteFlyweight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    }

    public void doOperation(String extrinsicState){
        System.out.println("Concrete Flyweight " + intrinsicState + " -\n " + extrinsicState);
    }
}
