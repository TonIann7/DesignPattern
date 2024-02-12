public class AbstractionImp extends Abstraction { //classe concreta AbstractionImp
    public AbstractionImp(Implementor implementor) { //costruttore
        super(implementor); //richiamo al costruttore della superclasse
    }
    public void doOperation() { //implementazione del metodo astratto
        implementor.newOperation(); //richiamo del metodo newOperation
    }
}
