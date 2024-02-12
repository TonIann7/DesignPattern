package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.AbstractProductA;
import CreationalPatterns.AbstractFactory.AbstractProductB;

abstract class AbstractFactory {
    abstract AbstractProductA createProductA();
    abstract AbstractProductB createProductB();
    
}
