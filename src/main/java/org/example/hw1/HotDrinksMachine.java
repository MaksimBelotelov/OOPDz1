package org.example.hw1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine implements VendingMachine {
    private List<Product> products;

    public HotDrinksMachine() {
        products = new ArrayList<>();
    }

    @Override
    public void addProduct(Product item) {
        if(item instanceof HotDrink)
            products.add(item);
        else
            System.out.println("\nНельзя положить это в этот автомат");
    }

    public Product getProduct(String name) {
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        System.out.println("\nТакого напитка нет");
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for(Product product: products) {
            if (product instanceof HotDrink) {
                if (product.getName().equals(name) &&
                        ((HotDrink) product).getVolume() == volume &&
                        ((HotDrink) product).getTemperature() == temperature) {
                    System.out.println("\nЗаберите напиток.");
                    return (HotDrink) product;
                }
            }
        }
        System.out.println("\nТакого напитка нет =(");
        return null;
    }
}
