# Topic: Creational Design Patterns:
## Author: Balan Victor FAF-192
## Introduction/Theory: 
In software engineering, behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.
## Objectives:
* Get familiar with the Behavioural Design Patterns.
* Update the current project to include at least 1 behavioural design pattern.
## Used Design Patterns: 
* Iterator 
## Implementation & Explanations:
### Iterator: 
In object-oriented programming, the iterator pattern is a design pattern in which an iterator is used to traverse a container and access the container's elements. The iterator pattern decouples algorithms from containers; in some cases, algorithms are necessarily container-specific and thus cannot be decoupled.
```
public interface Iterator {
    boolean hasNext();

    Object next();
}

public class ClientIterator implements Iterator {
    private Client[] clients;
    private int index = 0;

    public ClientIterator(Client[] clients) {
        this.clients = clients;
    }

    public Object next() {
        Client client = clients[index];
        index++;
        return client;
    }

    public boolean hasNext() {
        if (index >= clients.length || clients[index] == null) {
            return false;
        } else {
            return true;
        }
    }
}
```
In my case I used the iterator to access the elements of the List of Clients in my gym and display their information.
## Conclusion:
The behavioural design patterns help in the communicaton of software entities in a system. The Iterator in particular helped me iterate over a collection of objects without revealing information about their implementation.
