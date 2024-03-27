package application;

import java.util.ArrayList;
import java.util.List;

import application.model.AbstractAtividade;
import application.model.Compromisso;
import application.model.Tarefa;

public class App {
    public static void main(String[] args) {

        Tarefa t = new Tarefa();
        t.setDescricao("Teste de Tarefa");
        t.setConcluido(false);

        System.out.println(t.getDetalhes());

        Tarefa t2 = new Tarefa("Segundo Teste");

        System.out.println(t2.getDetalhes());

        Compromisso c = new Compromisso();
        c.setDescricao("Periodo de Avaliações");
        c.setDataInicial(21, 03, 2024);
        c.setDataFinal(22, 03, 2024);

        System.out.println(c.getDetalhes());

        List<AbstractAtividade> listaAtividades = new ArrayList<AbstractAtividade>();
        listaAtividades.add(t);
        listaAtividades.add(c);

        System.out.println("----------[Lista]----------");
        for(AbstractAtividade a : listaAtividades) {
            System.out.println(a.getDetalhes());
        }
    }
}