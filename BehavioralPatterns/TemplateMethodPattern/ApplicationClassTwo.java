package BehavioralPatterns.TemplateMethodPattern;

public class ApplicationClassTwo extends FrameWorkClass{
    public void stepOne(){
        System.out.println("ApplicationClassTwo: stepOne");
    }

    public void stepTwo(){
        System.out.println("ApplicationClassTwo: stepTwo");
    }

    public void stepThree(){
        System.out.println("ApplicationClassTwo: stepThree");
    }
    
    public void hookMethod(){
        System.out.println("ApplicationClassTwo: This is a hook method");
    }
}
