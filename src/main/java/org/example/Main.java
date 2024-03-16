package org.example;

public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy(1, "Constructor", 25, 20);
        Toy toy2 = new Toy(2, "Ukulele", 15, 15);
        Toy toy3 = new Toy(3, "Uno", 30, 20);
        Toy toy4 = new Toy(4, "D&D board game", 5, 10);
        Toy toy5 = new Toy(5, "Controller DualSense", 5, 5);
        Toy toy6 = new Toy(6, "Electric Railroad", 3, 5);
        Toy toy7 = new Toy(7, "Kids smartphone", 20, 50);

        Store toyStore = new Store();
        toyStore.addToy(toy1);
        toyStore.addToy(toy2);
        toyStore.addToy(toy3);
        toyStore.addToy(toy4);
        toyStore.addToy(toy5);
        toyStore.addToy(toy6);
        toyStore.addToy(toy7);

        toyStore.changeToyAmount(1, 50);

        toyStore.startGiveaway();

        Toy prizeToy = toyStore.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Вы выиграли " + prizeToy.getName());
        }

    }
}