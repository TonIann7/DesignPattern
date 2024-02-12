public abstract class OptionalWrapper implements Interface { //Classe astratta che implementa l'interfaccia Interface
//rappresenta effettivamente il decoratore , o almeno la sua astrazione
    protected Interface coreFunctionality; //riferimento all'oggetto da decorare

    public OptionalWrapper(Interface coreFunctionality) { //costruttore
        this.coreFunctionality = coreFunctionality; //inizializzazione del riferimento
    }

    public void doThis() { //implementazione del metodo doThis
        coreFunctionality.doThis(); //invocazione del metodo doThis sull'oggetto decorato
    }

}
