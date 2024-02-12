public class OptionalTwo extends OptionalWrapper{
    
    public OptionalTwo(Interface coreFunctionality) {
        super(coreFunctionality);
    }
    
    public void doThis() {
        super.doThis();
        System.out.println("doThis() in OptionalTwo");
    }
}
