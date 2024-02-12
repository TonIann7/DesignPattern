public class Leaf implements Component { //Classe foglia
    private String name; //nome del componente
    public Leaf(String name) { //costruttore
        this.name = name; //inizializzazione del nome
    }

    public void doOperation() { //implementazione del metodo doOperation
        System.out.println("doOperation() in " + name); //stampa a video
    }
}
