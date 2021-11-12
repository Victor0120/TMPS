# Topic: Creational Design Patterns:
## Author: Balan Victor FAF-192
## Introduction/Theory: 
In software engineering, a design pattern is a general repeatable solution to a commonly occurring problem in software design. A design pattern isn't a finished design that can be transformed directly into code. It is a description or template for how to solve a problem that can be used in many different situations. Creational design patterns are all about class instantiation. This pattern can be further divided into class-creation patterns and object-creational patterns. While class-creation patterns use inheritance effectively in the instantiation process, object-creation patterns use delegation effectively to get the job done.
## Implementation & Explanations:
The domain I chose is a gym with the corresponding equipment and staff. The Creational Design Patterns that were used in this project are: Singleton, Builder and Prototype. 
### Singleton: 
Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance. In this case the Singleton object is the boss of the gym since only one person can hold this important role.
```
public class BossOfThisGym {
    private static volatile BossOfThisGym boss = null;

    private BossOfThisGym() {
    }

    public static BossOfThisGym getInstance() {
        if (boss == null) {
            synchronized (BossOfThisGym.class) {
                if (boss == null) {
                    boss = new BossOfThisGym();
                }
            }
        }
        return boss;
    }

```
### Builder:
Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code. The object I chose to use this pattern with is a bar with weights. Since the bar can have one of many configurations of weight plates it seemed a good idea to use the Builder pattern here.
```
public interface BarBuilder {
    public void setBarType();

    public void set20kgPlates();

    public void set15kgPlates();

    public void set10kgPlates();

    public void set5kgPlates();

    public void set1kgPlates();

    public WeightedBar getWeightedBar();
}
```
### Prototype: 
Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes. I used this pattern to create clones of dumbbell objects (since all dumbbells come in pairs)
```
interface Prototype {
    public Prototype getClone();
}

public class Dumbbel implements Prototype {

    private int weight;

    public Dumbbel(int weight) {
        this.weight = weight;
    }

    public void getWeight() {
        System.out.println("Weight is: " + this.weight);
    }

    public Prototype getClone() {
        return new Dumbbel(weight);
    }
}

```
### Facade:
The facade pattern is a design pattern commonly used in object-oriented programming and is used as a front-facing interface masking more complex underlying or structural code. In my case the Cashier class is the facade that makes it easier to obtain the different memberships that are available at the gym.
```
public class Cashier {

    private Membership limited;
    private Membership unlimited;

    public Cashier(){
        limited = new LimitedMembership();
        unlimited = new UnlimitedMembership();
    }

    public void buyLimitedMembership(){
        limited.buy();
    }

    public void buyUnlimitedMembership(){
        unlimited.buy();
    }
}

public interface Membership {

    void buy();

}
```
### Composite:
The composite pattern is a structural design pattern, it describes a group of objects that are treated the same way as a single instance of the same type of object. The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies. Implementing the composite pattern lets clients treat individual objects and compositions uniformly. I used this pattern to describe the hierarchy of the lifters in the gym, stronger lifters are mentors to some weaker lifters than themselves, which are stored in the mentees list that each Lifter object has.
```
public class Lifter {

    private String name;
    private int maxLiftWeight;
    private List<Lifter> mentees;

    public Lifter (String name, int maxLiftWeight){
        this.name = name;
        this.maxLiftWeight = maxLiftWeight;
        mentees = new ArrayList<Lifter>();
    }

    public void add (Lifter mentee){
        mentees.add(mentee);
    }

    public void remove (Lifter mentee){
        mentees.remove(mentee);
    }

    public List<Lifter> getMentees(){
        return mentees;
    }

    public void getInfo(){
        System.out.println("Lifter "+ name +" can lift "+ maxLiftWeight +" kg");
    }
}
```
### Decorator:
The decorator pattern is a design pattern that allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class. I used it to extend the behaviour of a concrete object of the Treadmill class. The class only allows the treadmill to move at the default speed while the decorator makes it possible to make it run at different speeds.
```
public class Treadmill {

    public void activate(){
        System.out.println("The treadmill is moving at default speed.");
    }
}

public class TreadmillDecorator {

    protected Treadmill treadmill;

    public TreadmillDecorator (Treadmill treadmill){
        this.treadmill = treadmill;
    }

    public void activate(int speed){
        System.out.println("The treadmill is moving at "+ speed +" km/h");
    }
}
```
## Conclusion:
The creational design patterns are useful for increasing the flexibility and reusability of existing code.
