package exercicios.exercicio10;

public class RepositorioDeAlunos implements Repositorio<String>{

        @Override
        public void salvar(String obj) {
            System.out.println("Salvando aluno: " + obj);
        }
}
