package com.company.Domain.Clients.Implementations;

import com.company.Domain.Clients.Abstractions.Collection;
import com.company.Domain.Clients.Abstractions.Iterator;

public class ClientCollection implements Collection {
    private static final int maxClientNumber = 100;
    private int numberOfClients = 0;
    Client[] clients;

    public ClientCollection() {
        clients = new Client[maxClientNumber];

        addClient("John Smith", 18, "079123456");
        addClient("Lil Peep", 20, "079123469");
        addClient("Sherlock Holmes", 45, "069987654");
    }

    public void addClient(String name, int age, String phoneNumber) {
        Client client = new Client(name, age, phoneNumber);
        if (numberOfClients >= maxClientNumber) {
            System.out.println("No more available places.");
        } else {
            clients[numberOfClients] = client;
            numberOfClients++;
        }
    }

    public Iterator createIterator() {
        return new ClientIterator(clients);
    }
}
