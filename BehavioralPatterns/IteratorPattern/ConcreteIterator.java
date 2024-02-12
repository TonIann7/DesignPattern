public class ConcreteIterator implements Iterator { //classe che implementa l'interfaccia Iterator
    private String[] names; //array di stringhe

    private int position = 0 ;//posizione iniziale

    public ConcreteIterator(String [] names){//costruttore
        this.names=names;
    }

    public boolean hasNext(){//metodo che verifica se esiste un elemento successivo
        return position < names.length && names[position] != null;//ritorna true se la posizione è minore della lunghezza dell'array e se l'elemento in posizione position è diverso da null
    }

    public Object next(){
        return names[position++];//ritorna l'elemento in posizione position e incrementa la posizione di 1
    }

    
}
