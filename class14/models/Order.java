package class14.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Order {

    private List<Product> products;
    private Map<Department, List<Product>> map;
    public Order() {
    }

    public Order(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Map<Department, List<Product>> findAllProductsByDepartment() {

        Map<Department, List<Product>> productsByDepartment = new HashMap<>();

        for (Product product : products) {
            Department department = product.getDepartment();
            if (!productsByDepartment.containsKey(department)) {
                productsByDepartment.put(department, new ArrayList<>());
            }
            productsByDepartment.get(department).add(product);
        }
        return productsByDepartment;
    }

    public Map<Department, List<Product>> findAllProductsByDepartmentWithStream() {
        return products.stream()
                .collect(
                        HashMap::new,
                        (map, product) -> {
                            Department department = product.getDepartment();
                            if (!map.containsKey(department)) {
                                map.put(department, new ArrayList<>());
                            }
                            map.get(department).add(product);
                        },
                        Map::putAll
                );
    }

    public Map<Department, List<Product>> findAllProductsByDepartmentWithStreamAndGroupingBy() {
        return products.stream()
                .collect(
                        Collectors.groupingBy(Product::getDepartment)
                );
    }

    public Double calculateTotalValueWithStreamByDepartment() {

        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();

    }

    public Map<Department, Double> calculateTotalValueWithStreamAndGroupingByDepartment() {

        return products.stream()
                .collect(Collectors.groupingBy(Product::getDepartment,
                        Collectors.summingDouble(Product::getPrice)));
    }

    public Double calculateTotalValueWithFilterByDepartment(Department department) {

        return products.stream()
                .filter(product -> product.getDepartment() == department)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public Double calculateTotalValueWithReduce(Department department) {

        return products.stream()
                .filter(product -> product.getDepartment() == department)
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);
    }

    public Map<Department, Double> calculateTotalValueWithStreamAndMapByDepartment() {
        Map<Department, Double> totalValueByDepartment = new HashMap<>();

        for (Product product : products) {
            Department department = product.getDepartment();
            totalValueByDepartment.put(department,
                    totalValueByDepartment.getOrDefault(department, 0.0) + product.getPrice());
        }
        for(Department department :Department.values()){
            totalValueByDepartment.putIfAbsent(department, 0.0);
            System.out.println("Total value for department " + department + ": " + totalValueByDepartment.get(department));
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        }

        return totalValueByDepartment;
    }
}
