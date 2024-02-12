public class Facade { //Interfaccia Facade ( di facciata)
    private Class1 class1; //Sottoclasse 1
    private Class2 class2; //Sottoclasse 2
    private Class3 class3; //Sottoclasse 3

    public Facade(){ //costruttore
        this.class1 = new Class1();
        this.class2 = new Class2();
        this.class3 = new Class3();
    }

    public void metodo(){
        class1.metodo1();
        class2.metodo();
        class3.metodo();
    }
}
