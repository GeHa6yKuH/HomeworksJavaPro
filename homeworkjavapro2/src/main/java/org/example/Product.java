package org.example;

public class Product {
    private int id;
    private String name;
    private ProductCategory category;
    private double price;
    private Currency currency;
    private Company company;

    public Product(int id, String name, ProductCategory category, double price, Currency currency, Company company) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", currency=" + currency +
                ", company=" + company +
                '}';
    }
}
