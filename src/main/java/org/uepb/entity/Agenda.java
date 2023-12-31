package org.uepb.entity;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Atendimento> atendimentos = new ArrayList<>();
	private String nomeDono;

	public Agenda(AgendaBuilder builder) {
		this.atendimentos = builder.atendimentos;
		this.nomeDono = builder.nomeDono;
	}

	public Agenda() {}

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}

	public void addAtendimento(Atendimento atendimento) {
		this.atendimentos.add(atendimento);
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public void imprimeAtendimentos() {
		if (!atendimentos.isEmpty()) {
			System.out.println("Agenda: " + nomeDono);
			for (Atendimento atendimento : atendimentos) {
				System.out.println((atendimentos.indexOf(atendimento) + 1) + "º " + atendimento);
			}
		} else {
			System.out.println("A agenda está vazia!\n");
		}
	}

	public static class AgendaBuilder {
		private List<Atendimento> atendimentos = new ArrayList<>();
		private String nomeDono;

		public AgendaBuilder atendimentos(List<Atendimento> atendimentos) {
			this.atendimentos = atendimentos;
			return this;
		}

		public AgendaBuilder nomeDono(String nomeDono) {
			this.nomeDono = nomeDono;
			return this;
		}

		public Agenda build() {
			return new Agenda(this);
		}
	}
}
