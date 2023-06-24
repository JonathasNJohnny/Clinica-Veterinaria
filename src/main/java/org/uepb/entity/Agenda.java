package org.uepb.entity;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private ArrayList<Atendimento> atendimentos = new ArrayList<>();

	public Agenda() {
		super();
		this.atendimentos = new ArrayList<Atendimento>();
	}

	public ArrayList<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(ArrayList<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}
    
    

//    public boolean verificarHorario(horario) {
//
//    }
}
