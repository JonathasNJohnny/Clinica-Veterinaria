package org.uepb;

public class Main {

	public static void main(String[] args) {
		
		Sistema sistema = new Sistema();
		
		Groomer groomer1 = new Groomer("Marcos", "Passaros", "123.456.789.01");
		Groomer groomer2 = new Groomer("Mestre", "Répteis", "123.456.789.01");
		
		Veterinario veterinario = new Veterinario("Pablo", "123.456.789.01");
		
		Cliente cliente1 = new Cliente("Herpeton", "123.456.789.01", "(83) 9 4002-8922", "Rua dos Donos de Pet");
		Cliente cliente2 = new Cliente("Ornitos", "123.456.789.01", "(83) 9 4002-8922", "Rua dos Donos de Pet");
		
		Animal animal1 = new Animal("Jacarélvis", "Répteis", "Green Iguana", cliente1);
		
		Atendimento atendimento1 = new Atendimento(animal1, "23/07/2023 08:30", "Sem Descrição");
		
		sistema.getFuncionarios().add(groomer1);
		sistema.getFuncionarios().add(groomer2);
		sistema.setVeterinario(veterinario);
		sistema.adicionarAtendimento(atendimento1);
		veterinario.getAgenda().imprimeAtendimentos();
		groomer2.getAgenda().imprimeAtendimentos();
		sistema.realizarAtendimento(groomer2, 1);
		sistema.realizarAssistênciaVeterianaria(1);
	}
}
