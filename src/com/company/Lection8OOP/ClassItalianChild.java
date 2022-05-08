package com.company.Lection8OOP;

public class ClassItalianChild extends PersonMain{
    public ClassItalianChild(String name, String religion, String job) {
        super(name, religion, "Italian", "Italian", job, "Italy");
    }

    @Override
    public String sayHello() {
        String sayHello="Ciao Amico! ";
        return sayHello;
    }
}
