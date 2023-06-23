package org.uepb.controller;

import org.uepb.entity.Atendimento;
import org.uepb.entity.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private final List<String> ANIMAIS_LEGALMENTE_DOMESTICOS = new ArrayList<>();



    //TODO: CONCLUIR OS MÉTODOS ADICIONANDO A LÓGICA
    public void adicionarAtendimento() {
        Atendimento atendimento = new Atendimento();
    }

    public void removerAtendimento() {

    }

    public List<String> getAnimaisDomesticos() {
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Cães");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Gatos");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Coelhos");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Hamsters");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Porquinho-da-índia");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Chinchilas");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Peixes ornamentais");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Pássaros");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Tartarugas aquáticas");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Tartarugas terrestres");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Pequenos répteis");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Pequenos roedores");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Minipigs");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Cavalos");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Furões");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Ouriços");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Serpentes não venenosas");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Perus e galinhas");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Codornas");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Patos e marrecos");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Abelhas");
        ANIMAIS_LEGALMENTE_DOMESTICOS.add("Pequenos primatas");
        return ANIMAIS_LEGALMENTE_DOMESTICOS;
    }

}
