package BehavioralPatterns.MementoPattern;
public class RandomWalker { //Originator
    private int currentMilestone;//stato interno
    private int lastWalkedDistance;
    
    public RandomWalker(){//costruttore
        currentMilestone = 0;//inizializza lo stato interno
        lastWalkedDistance = 0;//inizializza lo stato interno
    }
    public void randomWalk(){ //metodo per camminare
        lastWalkedDistance = (int) (Math.random() * 100);//calcola la distanza percorsa
        currentMilestone += lastWalkedDistance;//aggiorna lo stato interno
    }
    public int getCurrentMilestone(){ //metodo per ottenere lo stato interno
        return currentMilestone;
    }

    public int getLastWalkedDistance(){ //metodo per ottenere la distanza percorsa
        return lastWalkedDistance;
    }

    public Memento createMemento(){//metodo per creare un memento
        return new WalkerMemento();
    }
    public class WalkerMemento implements Memento { //Concrete Memento
        private int mem_currentMilestone; // stato interno
        private int mem_lastWalkedDistance;      //stato interno
    
        public WalkerMemento(){//costruttore
            mem_currentMilestone = currentMilestone;//inizializza lo stato interno
            mem_lastWalkedDistance = lastWalkedDistance;//inizializza lo stato interno
        }
    
        public void restoreState(){//metodo per ripristinare lo stato interno
            currentMilestone = mem_currentMilestone;//ripristina lo stato interno
            lastWalkedDistance = mem_lastWalkedDistance;//  ripristina lo stato interno
        }
    }
}
