package exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Celular {

    List<Notificacao> notificacoes;

    public Celular(){
        this.notificacoes = new ArrayList<>();
    }

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }
}
