

public class OptionalOne extends OptionalWrapper { //Classe concreta che estende OptionalWrapper
    //rappresenta un decoratore concreto
    public OptionalOne(Interface coreFunctionality) {
        super(coreFunctionality);
    }
//implementazione del metodo doThis
    public void doThis() {
        super.doThis();//invocazione del metodo doThis sull'oggetto decorato
        System.out.println("doThis() in OptionalOne");
    }
}
