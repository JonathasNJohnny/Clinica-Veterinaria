package org.uepb.controller;

import org.uepb.entity.Atendimento;
import org.uepb.entity.Funcionario;
import org.uepb.entity.Groomer;
import org.uepb.entity.Veterinario;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	private ArrayList<Groomer> funcionarios = new ArrayList<>();
	private Veterinario veterinario;

	public Sistema() {
		super();
		this.funcionarios = new ArrayList<Groomer>();
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public ArrayList<Groomer> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Groomer> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public void adicionarAtendimento(Atendimento atendimento) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ID = new ArrayList<>();
		int choice = 0;
		while (choice < 1 || choice > 2 ) {
			System.out.println("\nO atendimento será com um groomer ou veterinário?\n[1] Groomer | [2] Veterinário: ");
			choice = sc.nextInt();
		}
		if (choice == 1) {
			choice = 0;
			if (!funcionarios.isEmpty()) {
				for (Groomer groomer : funcionarios) {
					if (groomer.getEspecialidade() == atendimento.getAnimalPaciente().getEspecie()) {
						System.out.println("ID: 00" + (funcionarios.indexOf(groomer)+1) + "\nNome: " + groomer.getNome() + "\nCPF: " + groomer.getCpf());
						ID.add(funcionarios.indexOf(groomer)+1);
					}
				}
				while (true) {
					System.out.println("Digite o ID do funcionário escolhido: ");
					choice = sc.nextInt();
					if (choice >= 1 && choice <= funcionarios.size() && ID.contains(choice)){
						break;
					}

				}
				funcionarios.get(choice-1).getAgenda().addAtendimento(atendimento);
				System.out.println("O atendimento com o Groomer foi marcado com sucesso!\n");
			}
		}
		else {
			choice = 0;
			veterinario.getAgenda().addAtendimento(atendimento);
			System.out.println("O atendimento com o Veterinário foi marcado com sucesso!\n");
		}
	}
	
	public void removerAtendimento(String nomeAnimal, String nomeDono) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice < 1 || choice > 2 ) {
			System.out.println("\nO atendimento será com um groomer ou veterinário?\n[1] Groomer | [2] Veterinário: ");
			choice = sc.nextInt();
		}
		if (choice == 1) {
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
		else {
			for (Atendimento atendimento : veterinario.getAgenda().getAtendimentos()) {
				if (atendimento.getAnimalPaciente().getNome() == nomeAnimal && atendimento.getAnimalPaciente().getDono().getNome() == nomeDono) {
					veterinario.getAgenda().getAtendimentos().remove(atendimento);
					break;
				}
			}
		}
	}
	public void realizarAtendimento(Funcionario funcionario, int index) {
		if (!funcionario.getAgenda().getAtendimentos().isEmpty()) {
			System.out.println("\nA consulta com o pet cujo dono se chama: " + funcionario.getAgenda().getAtendimentos().get(index-1).getAnimalPaciente().getDono().getNome() + " e com o pet de nome: " + funcionario.getAgenda().getAtendimentos().get(index-1).getAnimalPaciente().getNome() + " foi realizada com sucesso!");
			funcionario.getAgenda().getAtendimentos().remove(index-1);
		}
		else {
			System.out.println("A agenta está vazia!");
		}
	}
	
	public void realizarAssistenciaVeterianaria(int index) {
		if (!veterinario.getAgenda().getAtendimentos().isEmpty()) {
			System.out.println("\nA consulta com o pet cujo dono se chama: " + veterinario.getAgenda().getAtendimentos().get(index-1).getAnimalPaciente().getDono().getNome() + " e com o pet de nome: " + veterinario.getAgenda().getAtendimentos().get(index-1).getAnimalPaciente().getNome() + " foi realizada com sucesso!");
			veterinario.getAgenda().getAtendimentos().remove(index-1);
		}
		else {
			System.out.println("A agenta está vazia!");
		}
	}
}
