package org.uepb.controller;

import java.util.ArrayList;
import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		if (!funcionarios.isEmpty()) {
			for (Funcionario funcionario : funcionarios) {
				System.out.println((funcionarios.indexOf(funcionario)+1) + "º \nNome: " + funcionario.getNome() + "\nCPF: " + funcionario.getCpf());
			}
			while (true) {
				System.out.println("Digite o número do funcionário escolhido: ");
				choice = sc.nextInt();
				if (choice >= 1 && choice <= funcionarios.size());{
					break;
				}
			}
			funcionarios.get(choice-1).getAgenda().getAtendimentos().add(atendimento);
			System.out.println("Atendimento marcado com sucesso!");
		}
	}
	
	public void removerAtendimento(String nomeAnimal, String nomeDono) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		if (!funcionarios.isEmpty()) {
			for (Funcionario funcionario : funcionarios) {
				System.out.println((funcionarios.indexOf(funcionario)+1) + "º \nNome: " + funcionario.getNome() + "\nCPF: " + funcionario.getCpf());
			}
			while (true) {
				System.out.println("Digite o número do funcionário: ");
				choice = sc.nextInt();
				if (choice >= 1 && choice <= funcionarios.size());{
					break;
				}
			}
			for (Atendimento atendimento : funcionarios.get(choice-1).getAgenda().getAtendimentos()) {
				if (atendimento.getAnimalPaciente().getNome() == nomeAnimal && atendimento.getAnimalPaciente().getDono().getNome() == nomeDono) {
					funcionarios.get(choice-1).getAgenda().getAtendimentos().remove(atendimento);
					break;
				}
			}
		}
	}
	public void realizarAtendimento(Funcionario funcionario) {

	}
	
	public void realizarProcedimento(Funcionario funcionario) {
		
	}
}
