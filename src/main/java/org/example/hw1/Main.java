package org.example.hw1;

// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
// getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
// Все вышеуказанное создать согласно принципам ООП, пройденным на семинаре.

public class Main {
    public static void main(String[] args) {
        HotDrinksMachine m1 = new HotDrinksMachine();
        HotDrinksMachine m2 = new HotDrinksMachine();

        m1.addProduct(new HotDrink("Чай", 60.0, 200, 91));
        m1.addProduct(new HotDrink("Эспрессо", 120.0, 40, 90));

        m2.addProduct(new HotDrink("Американо", 120.0, 100, 84));
        m2.addProduct(new HotDrink("Капучино", 180.0, 200, 70));

        System.out.println(m1.getProduct("Эспрессо", 40, 90));
        System.out.println(m1.getProduct("Латте", 300, 90));

        System.out.println(m2.getProduct("Флэт уайт", 150, 90));
        System.out.println(m2.getProduct("Капучино", 200, 70));
    }
}
