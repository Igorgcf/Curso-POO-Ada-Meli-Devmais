package exercicios.funcional_programing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {

            int[] numbers = {2, 5, 8, 1, 10, 7, 4};
            List<User> users = Arrays.asList(
                    new User("Ana", 28),
                    new User("Bruno", 35),
                    new User("Carla", 22),
                    new User("Diego", 40)
            );

            public void doubleNumbers() {
                List<Integer> doubledNumbers = new ArrayList<>();
                Arrays.stream(numbers)
                        .map(n -> n * 2)
                        .forEach(doubledNumbers::add);
                System.out.println("1.1 - Descrição: Dobre todos os valores na lista numeros.");
                System.out.println("Números dobrados: " + doubledNumbers);
                System.out.println("\n***************************************************************************************************************");
            }

            public void userNames() {
                List<String> userNames = new ArrayList<>();
                users.stream()
                        .map(User::getName)
                        .forEach(userNames::add);
                System.out.println("\n1.2 - Descrição: Crie uma lista com apenas os nomes dos objetos usuarios.");
                System.out.println("Nomes dos usuários: " + userNames);
                System.out.println("\n***************************************************************************************************************");
            }

            public void filterNumbers() {
                List<Integer> filteredNumbers = new ArrayList<>();
                Arrays.stream(numbers)
                        .filter(n -> n > 5)
                        .forEach(filteredNumbers::add);
                System.out.println("\n2.1 - Descrição: Filtre a lista numeros para manter apenas os números maiores que 5.");
                System.out.println("Números maiores que 5: " + filteredNumbers);
                System.out.println("\n***************************************************************************************************************");
            }

            public void filterUsersByAge() {
                List<User> filteredUsers = new ArrayList<>();
                users.stream()
                        .filter(user -> user.getAge() >= 30)
                        .forEach(filteredUsers::add);
                System.out.println("\n2.2 - Descrição: Filtre a lista usuarios para manter apenas aqueles com idade igual ou superior a 30.");
                System.out.println("Usuários com idade igual ou superior a 30: " + filteredUsers);
                System.out.println("\n***************************************************************************************************************");
            }

            public void reduceToNumbers() {
                int sum = Arrays.stream(numbers)
                        .reduce(0, Integer::sum);
                System.out.println("\n3.1 - Descrição: Calcule a soma total de todos os elementos na lista numeros.");
                System.out.println("Soma total dos números: " + sum);
                System.out.println("\n***************************************************************************************************************");
            }

            public void oldestUser() {
                User oldestUser = users.stream()
                        .reduce((u1, u2) -> u1.getAge() > u2.getAge() ? u1 : u2)
                        .orElse(null);
                System.out.println("\n3.2 - Descrição: Encontre o objeto do usuário mais velho na lista usuarios.");
                System.out.println("Usuário mais velho: " + oldestUser);
                System.out.println("\n***************************************************************************************************************");
            }

            public void sumOfAges() {
                int sumOfAges = users.stream()
                        .filter(user -> user.getAge() < 35)
                        .map(User::getAge)
                        .reduce(0, Integer::sum);
                System.out.println("\n4.1 - Descrição: Calcule a soma das idades de todos os usuários que têm menos de 35 anos.");
                System.out.println("Soma das idades dos usuários com menos de 35 anos: " + sumOfAges);
                System.out.println("\n***************************************************************************************************************");
            }
    }
