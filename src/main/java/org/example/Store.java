package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Store {
    private ArrayList<Toy> toys;
    private ArrayList<Toy> prizeToys;
    private String filePath;

    public Store() {
        this.toys = new ArrayList<Toy>();
        this.prizeToys = new ArrayList<Toy>();
        this.filePath = "prizeToys.txt";
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }


    public void changeToyAmount(int toyId, double newChance){
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setChance(newChance);
            }
        }
    }

    public void startGiveaway() {
        prizeToys.clear();

        for (Toy toy : toys) {
            double random = Math.random() * 100;
            if (random < toy.getAmount()) {
                prizeToys.add(toy);
            }
        }
    }

    public Toy getPrizeToy() {
        if (!prizeToys.isEmpty()) {
            Toy prizeToy = prizeToys.remove(0);
            prizeToy.setAmount(prizeToy.getAmount() - 1);

            try {
                FileWriter writer = new FileWriter(filePath, true);
                writer.write(prizeToy.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Непредвиденная ошибка файла.");
            }

            return prizeToy;
        } else {
            System.out.println("Больше нет игрушек.");
            return null;
        }
    }
}
