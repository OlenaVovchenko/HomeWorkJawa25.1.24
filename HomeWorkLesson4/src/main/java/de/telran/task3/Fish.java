package de.telran.task3;

public class Fish implements Swim {
    String species;
    double weight;

    Fish(String species, double weight) {
        this.species = species;
        this.weight = weight;
    }

    @Override
    public void swim() {
        System.out.println("Рыба " + species + ", весом " + weight + " кг, плавает.");
    }
}
