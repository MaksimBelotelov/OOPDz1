package org.example.hw1;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink(String name, double price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return  super.toString() + ' ' +
                "temperature = " + temperature;
    }
}
