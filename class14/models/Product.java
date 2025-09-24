package class14.models;

import java.util.Objects;

public class Product {

    private Long id;
    private String name;
    private Double price;
    private String description;
    private Department department;

    public Product(Long id, String name, Double price, String description, Department department) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", price: " + price +
                ", description: '" + description + '\'' +
                '}';
    }
}
