package exercicios.exercicio10;

public class RepositorioDeProdutos implements Repositorio<Produto>{


    @Override
    public void salvar(Produto obj) {
        System.out.println("Salvando produto: " + obj.getNome() + " com preco: " + obj.getPreco());
    }
}
