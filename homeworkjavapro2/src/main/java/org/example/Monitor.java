package org.example;

public class Monitor extends Product{

    private int frequency;

    public Monitor(int id, String name, ProductCategory category, double price, Currency currency, Company company, int frequency) {
        super(id, name, category, price, currency, company);
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", category=" + super.getCategory() +
                ", price=" + super.getPrice() +
                ", currency=" + super.getCurrency() +
                ", company=" + super.getCompany() +
                ", frequency=" + frequency +
                '}';
    }
}
