

public class Adapter implements Target { //classe che adatta Adaptee all'interfaccia Target
    private Adaptee adaptee; //riferimento all'oggetto Adaptee

    public Adapter(Adaptee adaptee) { //costruttore che inizializza il riferimento all'oggetto Adaptee
        this.adaptee = adaptee;
    }

    public void request() { //metodo che il client chiama per generare i rapporti
        adaptee.specificRequest(); //adatta il metodo specificRequest() di Adaptee al metodo request() di Target
        System.out.println("Adapting Adaptee.specificRequest() to Target.request()");
    }

}
