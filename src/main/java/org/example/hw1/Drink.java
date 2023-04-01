package org.example.hw1;

public class Drink extends Product{
    int volume;

    public Drink(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return  "name = " + super.getName() + ' ' +
                "volume = " + volume + ' ' +
                "cost = " + super.getPrice();
    }
}
