public class TerminalExpression implements AbstractExpression {
    private String data;//stringa di input

    public TerminalExpression(String data){//costruttore che prende in input una stringa
this.data = data;//inizializza la stringa di input
    }
    public boolean interpet(Context context){//metodo interpret
        if(context.input.contains(data)){//se la stringa di input contiene la stringa di input del terminale
            return true;// ritorna true
        }
        return false;//altrimenti ritorna false
    }
}
