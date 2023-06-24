package org.uepb.entity;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private ArrayList<Atendimento> atendimentos = new ArrayList<>();
    private String nomeDono;

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
	
	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public void imprimeAtendimentos(){
		if (!atendimentos.isEmpty()) {
			System.out.println(nomeDono);
			for (Atendimento atendimento : atendimentos) {
				System.out.println((atendimentos.indexOf(atendimento)+1) + "º " + atendimento);
			}
		}
		else {
			System.out.println("A agenda está vazia!\n");
		}
	}
}
