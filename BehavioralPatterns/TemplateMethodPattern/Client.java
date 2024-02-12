package BehavioralPatterns.TemplateMethodPattern;

public class Client {
    public static void main(String[] args) {
        FrameWorkClass appOne = new ApplicationClassOne();
        appOne.templateMethod();
        System.out.println();

        FrameWorkClass appTwo = new ApplicationClassTwo();
        appTwo.templateMethod();
        
    }
}
