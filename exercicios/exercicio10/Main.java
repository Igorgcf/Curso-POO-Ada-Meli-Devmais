package exercicios.exercicio10;

public class Main {

    public static void main(String[] args) {

        System.out.println("*****-----------------------------------*****");
        System.out.println("--- Repositório de Alunos ---");
        RepositorioDeAlunos repo = new RepositorioDeAlunos();
        repo.salvar("João");
        repo.salvar("Maria");
        repo.salvar("Pedro");
        System.out.println();
        System.out.println("*****-----------------------------------*****");

        System.out.println("--- Repositório de Produtos ---");
        RepositorioDeProdutos repoProd = new RepositorioDeProdutos();
        repoProd.salvar(new Produto("Notebook", 144.00));
        repoProd.salvar(new Produto("Smartphone", 777.00));
        repoProd.salvar(new Produto("Tablet", 770.0));

    }
}
