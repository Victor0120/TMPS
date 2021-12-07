package com.company.Domain.Clients.Implementations;

public class Client {
    private String name;
    private int age;
    private String phoneNumber;

    public Client(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void getInfo() {
        System.out.println("Client info:");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Phone Number:" + phoneNumber);
    }
}
