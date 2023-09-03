package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShopManager {

    //продуктовый лист инициализация
    static ArrayList<Product> products = new ArrayList<>();
    public static void main(String[] args) {

        // мои примеры продуктов

        Product product1 = new Product(1,"Bazilisk mouse", ProductCategory.MOUSE, 70,Currency.EURO, Company.RAZER);
        Product product2 = new Product(2,"notebook", ProductCategory.LAPTOP, 1000,Currency.DOLLAR, Company.ACER);
        Product product3 = new Product(3,"bluetooth headphones", ProductCategory.HEADPHONES, 200.60,Currency.DOLLAR, Company.SONY);
        Product product4 = new Monitor(4,"HDMI gaming monitor", ProductCategory.MONITOR, 157.90,Currency.POUND, Company.AOC, 165);
        Product product5 = new Product(5,"Core i7 processor", ProductCategory.PROCESSOR, 200,Currency.EURO, Company.INTEL);
        Product product6 = new Product(6,"Monitor for work", ProductCategory.MOUSE, 75.99,Currency.EURO, Company.INTEL);
        Product product7 = new Product(7,"smart watch", ProductCategory.SMARTDEVICE, 560,Currency.EURO, Company.SONY);
        Product product8 = new Product(8,"Mouse pad", ProductCategory.OTHER, 81.60,Currency.DOLLAR, Company.RAZER);
        Product product9 = new Product(9,"Smart teapot", ProductCategory.OTHER, 130,Currency.POUND, Company.SONY);
        Product product10 = new Product(10,"bluetooth headphones with light", ProductCategory.HEADPHONES, 400.99,Currency.DOLLAR, Company.RAZER);


        //test method 1

        System.out.println("test 1 m");
        ShopManager shopManager = new ShopManager();
        shopManager.addProduct(product1);
        shopManager.addProduct(product2);
        shopManager.addProduct(product3);
        shopManager.addProduct(product4);
        shopManager.addProduct(product5);
        shopManager.addProduct(product6);
        shopManager.addProduct(product7);
        shopManager.addProduct(product8);
        shopManager.addProduct(product9);
        shopManager.addProduct(product10);

        System.out.println(products);

        // test method 2

        System.out.println("test 2 m");
        System.out.println(shopManager.getProductsByCategory(ProductCategory.HEADPHONES));

        // test method 3

        System.out.println("test 3 m");
        System.out.println(shopManager.getProductsByPriceRange(100,400,Currency.EURO));
    }

    // реализация добавления продукта
    public void addProduct(Product product) {
        products.add(product);
    }

    // реализация метода поиска по категории

     /*public List<Product> getProductsByCategory(ProductCategory category) {
        List<Product> productList = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                productList.add(product);
            }
        }
        return productList;
    }*/

    // реализация метода поиска по категориям с использованием стримов:)
    public List<Product> getProductsByCategory(ProductCategory category) {
        return products.stream()
                .filter(a -> a.getCategory().equals(category))
                .toList();
    }

    // реализация метода поиска по цене и валюте

   /* public List<Product> getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) {
        List<Product> productList = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice && product.getCurrency().equals(currency)) {
                productList.add(product);
            }
        }
        return productList;
    }*/

    // реализация метода поиска по цене и валюте с использованием стримов:)
    public List<Product> getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) {
        return products.stream()
                .filter(a -> a.getPrice() >= minPrice)
                .filter(a -> a.getPrice() <= maxPrice)
                .filter(a -> a.getCurrency().equals(currency))
                .toList();
    }

}