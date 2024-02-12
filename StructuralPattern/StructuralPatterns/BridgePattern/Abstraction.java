public abstract class Abstraction { //classe astratta Abstraction
    protected Implementor implementor; // questo è il vero e proprio BRIDGE che fa
    //riferimento all'interfaccia Implementor 
    public Abstraction(Implementor implementor) { //costruttore
        this.implementor = implementor; //inizializzazione del riferimento
}
        abstract void doOperation(); //metodo astratto operation
       
}
