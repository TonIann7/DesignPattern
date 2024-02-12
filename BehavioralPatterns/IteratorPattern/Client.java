public class Client {
    public static void main(String[] args) {
        String[] names = {//array di stringhe
            "Cavani",
            "Lavezzi",
            "hamsik"
        };

        Aggregate aggregate = new ConcreteAggregate(names);//crea un nuovo oggetto di tipo ConcreteAggregate
        Iterator iterator = aggregate.createIterator();//crea un nuovo iteratore
        while(iterator.hasNext()){//ciclo che scorre l'iteratore
            System.out.println(iterator.next());//stampa l'elemento successivo
        } //stampa Cavani, Lavezzi, Hamsik
        
    }
}
