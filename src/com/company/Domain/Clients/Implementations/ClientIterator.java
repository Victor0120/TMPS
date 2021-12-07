package com.company.Domain.Clients.Implementations;

import com.company.Domain.Clients.Abstractions.Iterator;

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
