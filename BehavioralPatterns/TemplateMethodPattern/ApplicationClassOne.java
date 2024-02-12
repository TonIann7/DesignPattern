package BehavioralPatterns.TemplateMethodPattern;

public class ApplicationClassOne extends FrameWorkClass {
    public void stepOne(){
        System.out.println("ApplicationClassOne: stepOne");
    }

    public void stepTwo(){
        System.out.println("ApplicationClassOne: stepTwo");
    }

    public void stepThree(){
        System.out.println("ApplicationClassOne: stepThree");
    }

    public void hookMethod(){
        System.out.println("ApplicationClassOne: This is a hook method");
    }
}
