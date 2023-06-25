package org.uepb;

import org.uepb.controller.Sistema;
import org.uepb.entity.*;

public class Main {

	public static void main(String[] args) {
		
		Sistema sistema = new Sistema();

		Groomer groomer1 = new Groomer.GroomerBuilder()
				.nome("Marcos")
				.especialidade("Passaros")
				.cpf("123.456.789-01")
				.build();

		Groomer groomer2 = new Groomer.GroomerBuilder()
				.nome("Mestre")
				.especialidade("Répteis")
				.cpf("123.456.789-01")
				.build();

		Veterinario veterinario = new Veterinario.VeterinarioBuilder()
				.nome("Pablo")
				.cpf("123.456.789-01")
				.build();

		Cliente cliente1 = new Cliente.Builder()
				.nome("Herpeton")
				.cpf("123.456.789-01")
				.telefone("(83) 9 4002-8922")
				.endereco("Rua dos Donos de Pet")
				.build();

		Cliente cliente2 = new Cliente.Builder()
				.nome("Ornitos")
				.cpf("123.456.789-01")
				.telefone("(83) 9 4002-8922")
				.endereco("Rua dos Donos de Pet")
				.build();

		Animal animal1 = new Animal.Builder()
				.nome("Jacarélvis")
				.especie("Répteis")
				.raca("Green Iguana")
				.dono(cliente1)
				.build();

		Atendimento atendimento1 = new Atendimento.Builder()
				.animalPaciente(animal1)
				.horarioAtendimento("23/07/2023 08:30")
				.descricao("Sem Descrição")
				.build();
		
		sistema.getFuncionarios().add(groomer1);
		sistema.getFuncionarios().add(groomer2);
		sistema.setVeterinario(veterinario);
		sistema.adicionarAtendimento(atendimento1);
		veterinario.getAgenda().imprimeAtendimentos();
		groomer2.getAgenda().imprimeAtendimentos();
		sistema.realizarAtendimento(groomer2, 1);
		sistema.realizarAssistenciaVeterianaria(1);
	}
}
