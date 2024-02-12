import java.util.HashSet;
import java.util.Set;

public class Proxy implements Subject{ //classe proxy che implementa l'interfaccia Subject
    private Subject realSubject;     //riferimento all'oggetto reale
    private Set<String> serverhost; //insieme di serverhost

    public Proxy() {
        this.realSubject= new RealSubject(); //crea un nuovo oggetto reale
        this.serverhost = new HashSet<>(); //crea un nuovo insieme di serverhost
        serverhost.add("www.google.com"); //aggiunge un serverhost all'insieme
    }

    public void doIt(String server) { //metodo per eseguire l'operazione richiesta
        if(this.serverhost.contains(server)){ //se l'insieme contiene il serverhost
            realSubject.doIt(server); //esegue l'operazione richiesta
        }else{
            System.out.println("Access Denied"); //altrimenti stampa "Access Denied"
        }
    }
}
