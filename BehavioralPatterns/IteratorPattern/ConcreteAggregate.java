public class ConcreteAggregate implements Aggregate { //classe che implementa l'interfaccia Aggregate
    private String[] names; //array di stringhe

    public ConcreteAggregate(String[] names){
        this.names=names; //costruttore
    }

    public Iterator createIterator(){//metodo che crea un iteratore
        return new ConcreteIterator(names);//ritorna un nuovo iteratore
    }
    
}
