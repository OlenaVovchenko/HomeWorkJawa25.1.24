package de.telran.task3;

public class Boat implements Swim {
    double speed;

    Boat(double speed) {
        this.speed = speed;
    }

    @Override
    public void swim() {
        System.out.println("Лодка плывет со скоростью " + speed + " узлов.");
    }
}
