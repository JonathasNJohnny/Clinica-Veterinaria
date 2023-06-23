package org.uepb.entity;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Atendimento> atendimentos = new ArrayList<>();

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(List<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }


//    public boolean verificarHorario(horario) {
//
//    }
}
