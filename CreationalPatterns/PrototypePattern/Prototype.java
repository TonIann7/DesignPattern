package CreationalPatterns.PrototypePattern;

public interface Prototype extends Cloneable{
    public abstract Object clone();
    public abstract void print();
}
