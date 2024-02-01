package de.telran.task3;

public class Human implements Swim {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(name + ", возраст " + age + ", плавает как человек.");
    }
}
