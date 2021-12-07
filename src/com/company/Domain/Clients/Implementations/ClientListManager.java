package com.company.Domain.Clients.Implementations;

import com.company.Domain.Clients.Abstractions.Iterator;

public class ClientListManager {
    ClientCollection clients;

    public ClientListManager(ClientCollection clients) {
        this.clients = clients;
    }

    public void printClients() {
        Iterator iterator = clients.createIterator();
        while (iterator.hasNext()){
            Client client = (Client) iterator.next();
            client.getInfo();
        }
    }
}
