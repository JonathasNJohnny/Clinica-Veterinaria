package org.uepb.controller;
import java.util.ArrayList;

public class Sistema {
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();

	public Sistema() {
		super();
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public void adicionarAtendimento(Atendimento atendimento) {
		if (!funcionarios.isEmpty()) {
			for (Funcionario funcionario : funcionarios) {
				System.out.println("Funcionário:" + funcionario.getNome() + "\nCPF: " + funcionario.getCpf());
			}
		}
	}

}
