import java.util.ArrayList;
import java.util.List;

public class Composite implements Component { //Classe Composite
    private List<Component> children = new ArrayList<>(); //Lista di componenti

public Composite(String name) { //costruttore
        
    }

    public void addComponent(Component component) { //metodo per aggiungere un componente
        children.add(component);
    }

    public void removeComponent(Component component) { //metodo per rimuovere un componente
        children.remove(component);
    }

    public void doOperation() { //implementazione del metodo doOperation
        for (Component component : children) { //ciclo per ogni componente
            component.doOperation(); //richiamo del metodo doOperation per ogni componente
        }
    }




}
