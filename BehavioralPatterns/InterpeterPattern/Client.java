

public class Client {
    public static void main(String[] args) {
        AbstractExpression person1= new TerminalExpression("Cavani");
        AbstractExpression person2= new TerminalExpression("Lavezzi");
        

        AbstractExpression isSingle = new NonTerminalExpression(person1,person2);
        Context context = new Context("Gargano");
        System.out.println("Gargano is single? "+isSingle.interpet(context));
    }
    
}
