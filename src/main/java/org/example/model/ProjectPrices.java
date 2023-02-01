package org.example.model;

public class ProjectPrices {
    private String name;
    private int price;

    public ProjectPrices(String name, int prise) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProjectPrices{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
