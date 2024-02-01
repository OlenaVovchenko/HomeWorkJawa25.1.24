package de.telran.task3;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Иван", 30);
        Fish fish = new Fish("Окунь", 1.5);
        Boat boat = new Boat(20);

        human.swim();
        fish.swim();
        boat.swim();
    }
}