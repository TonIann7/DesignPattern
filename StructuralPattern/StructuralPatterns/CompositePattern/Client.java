public class Client {
    public static void main(String[] args) {
        Component component1 = new Leaf("Leaf1");
        Component component2= new Leaf("Leaf2");

        Composite composite1 = new Composite("Composite1");
        composite1.addComponent(component1);
        composite1.addComponent(component2);

        composite1.doOperation();
    }
}
