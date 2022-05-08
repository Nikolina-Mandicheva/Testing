package com.company.Lection8OOP;

public class ClassAmerican extends PersonMain{

    public ClassAmerican(String name,  String religion, String job) {
        super(name,  religion, "English", "American", job, "USA");
        System.out.println("this is American object " + name);

    }

    @Override
    public String sayHello() {
        String sayHello="\"Hello there!\"";

        return sayHello;
    }

    @Override
    public String celebrateEaster() {
        return super.celebrateEaster();
    }

    @Override
    public String isAdult() {
        String isAdult;
        if (getAge() >= 21) {
            isAdult = "Yes  by American law";
        } else {
            isAdult = "No  by American law";
        }
        return isAdult;
    }

    void celebrateMemorialDay() {
        System.out.println("I'm celebrating Memorial day on 30th of May");
    }
}
