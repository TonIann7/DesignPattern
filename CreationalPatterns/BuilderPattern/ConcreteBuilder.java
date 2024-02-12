package CreationalPatterns.BuilderPattern;

public class ConcreteBuilder extends Builder{//ConcreteBuilder class
    private product productInstance; // This is the product that will be built

    public ConcreteBuilder(){
        this.productInstance= new product(); // This is the product that will be built
    }
    void buildpart(){
// implementa la logica per costruire l'oggetto passo dopo passo 
//aggiorna le proprietà dell'oggetto prodotto
    }

    product getResult(){//ritorna l'oggetto prodotto
        return this.productInstance; 
    }
}