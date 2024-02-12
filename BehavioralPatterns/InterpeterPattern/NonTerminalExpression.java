public class NonTerminalExpression implements AbstractExpression {
    private AbstractExpression expression1;//espressione 1
    private AbstractExpression expression2;//   espressione 2

    public NonTerminalExpression(AbstractExpression expression1, AbstractExpression expression2){//costruttore che prende in input due espressioni
        this.expression1 = expression1;//inizializza espressione 1
        this.expression2 = expression2;//inizializza espressione 2
    }

    public boolean interpet(Context context){//metodo interpret
        return expression1.interpet(context) || expression2.interpet(context);//ritorna il risultato dell'operazione logica tra le due espressioni

    }
}
