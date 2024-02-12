package BehavioralPatterns.MementoPattern;
public class MementoExample {
    public static void main(String[] args) {
        RandomWalker luke = new RandomWalker();
        Memento tripStop = luke.createMemento();

        for(int i=1; i<=4   ; i++) {
            luke.randomWalk();
           whereIs(luke);
           System.out.println("Do you like this place?");
           if(Math.random() < .4) {
              System.out.println("No");
              tripStop.restoreState();
              whereIs(luke);}
              else{
                System.out.println("Yes");
                tripStop = luke.createMemento();
              }
           }
           System.out.println("You reach the km" + luke.getCurrentMilestone());
        }
        public static void whereIs(RandomWalker rw){
            System.out.println("You are at km" + rw.getCurrentMilestone());
            System.out.println("You have walked " + rw.getLastWalkedDistance() + " km");
        }
    }

