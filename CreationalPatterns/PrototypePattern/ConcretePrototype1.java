package CreationalPatterns.PrototypePattern;

public class ConcretePrototype1 implements Prototype {
    public Object clone() {
           try {
            return super.clone();// return the cloned object
           }catch(CloneNotSupportedException e)// catch the exception if it occurs
{
    e.printStackTrace();//  print the stack trace
    return null;// return null
}        }
 
public void print(){
    System.out.println("This is a clone of ");
}

    }
