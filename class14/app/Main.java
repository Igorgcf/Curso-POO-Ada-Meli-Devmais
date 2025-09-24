package class14.app;

import class14.models.Department;
import class14.models.Order;
import class14.models.Product;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        Order order = getOrder();

        Map<Department, List<Product>> productsByDepartment = order.findAllProductsByDepartment();

        System.out.println("****----Products by Department without expression lambda and with classic for:----****");
        for (Map.Entry<Department, List<Product>> entry : productsByDepartment.entrySet()) {
            Department department = entry.getKey();
            List<Product> products = entry.getValue();
            System.out.println("Department: " + department);
            System.out.println("Products:");
            for (Product product : products) {
                System.out.println(product);
            }
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        }

        Map<Department, List<Product>> productsByDepartmentWithStream = order.findAllProductsByDepartmentWithStream();
        System.out.println("****----Products by Department with Stream, expression lambda and forEach:----****");
        productsByDepartmentWithStream.forEach((department, products) -> {
            System.out.println("Department: " + department);
            System.out.println("Products:");
            products.forEach(System.out::println);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        });
    }

    private static Order getOrder() {
        Product product1 = new Product(1L, "Notebook", 5000.00, "Notebook Gamer", Department.ELECTRONICS);
        Product product2 = new Product(2L, "Mouse", 150.00, "Mouse Gamer", Department.ELECTRONICS);
        Product product3 = new Product(3L, "Clean Code", 100.00, "Livro sobre boas práticas de código", Department.BOOKSTORE);
        Product product4 = new Product(4L, "O Senhor dos Anéis", 80.00, "Livro de fantasia", Department.BOOKSTORE);
        Product product5 = new Product(5L, "Calça Jeans", 150.00, "Calça Jeans Masculina", Department.CLOTHING);

        return new Order(asList(product1, product2, product3, product4, product5));
    }
}
