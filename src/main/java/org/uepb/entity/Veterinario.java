package org.uepb.entity;

public class Veterinario extends Funcionario {
    public Veterinario(String nome, String especialidade, String cpf) {
        super(nome, especialidade, cpf);
        
    }
    
    @Override
	public String toString() {
		return "Veterinário \nNome: " + getNome() + 
				"\nEspecialidade: " + getEspecialidade() + 
				"\nCPF: " + getCpf();
	}
    
}
