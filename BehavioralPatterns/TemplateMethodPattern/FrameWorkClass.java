package BehavioralPatterns.TemplateMethodPattern;

public abstract class FrameWorkClass {
    public final void templateMethod(){
        stepOne();
        stepTwo();
        stepThree();
        hookMethod();
    }

    public abstract void stepOne();
    public abstract void stepTwo();
    public abstract void stepThree();

    public void hookMethod(){
        System.out.println("This is a hook method");
    }
}
