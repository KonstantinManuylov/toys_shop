package org.example;

public class Toy {
    private int id;
    private String name;
    private int amount;
    private double chance;

    public Toy(int id, String name, int amount, double chance) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.chance = chance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getChance() {
        return chance;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setChance(double chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return String.format("Игрушка: %s, Количество: %s", name, amount);
    }
}
