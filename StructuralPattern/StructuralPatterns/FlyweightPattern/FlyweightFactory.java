import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory { //Fabbrica che gestisce gli oggetti flyweight
    //Garantisce che oggetti simili vengano condivisi correttamente
    public FlyweightFactory() {
    }

    private Map<String, Flyweight> flyweights = new HashMap<>(); //mappa che associa lo stato condiviso con l'oggetto flyweight
    public Flyweight getFlyweight(String state){ //metodo per ottenere l'oggetto flyweight
        Flyweight flyweight = flyweights.get(state); //cerca l'oggetto flyweight nella mappa
        if(flyweight == null){ //se non esiste
            flyweight = new ConcreteFlyweight(state); //crea un nuovo oggetto flyweight
            flyweights.put(state, flyweight); //aggiunge l'oggetto alla mappa
        }else{
            System.out.println("Flyweight " + state + " already exists");}
        return flyweight; //restituisce l'oggetto flyweight
    }
}
