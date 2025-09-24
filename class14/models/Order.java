package class14.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {

    private List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Map<Department, List<Product>> findAllProductsByDepartment(){

        Map<Department, List<Product>> productsByDepartment = new HashMap<>();

        for(Product product : products){
            Department department = product.getDepartment();
            if(!productsByDepartment.containsKey(department)){
                productsByDepartment.put(department, new ArrayList<>());
            }
            productsByDepartment.get(department).add(product);
        }
        return productsByDepartment;
    }

    public Map<Department, List<Product>> findAllProductsByDepartmentWithStream(){
        return products.stream()
                .collect(
                        HashMap::new,
                        (map, product) -> {
                            Department department = product.getDepartment();
                            if(!map.containsKey(department)){
                                map.put(department, new ArrayList<>());
                            }
                            map.get(department).add(product);
                        },
                        Map::putAll
                );
    }
}
