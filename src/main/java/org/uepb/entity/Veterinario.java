package org.uepb.entity;

public class Veterinario extends Funcionario {
    public Veterinario(String nome, String cpf) {
        super(nome, cpf);
        
    }
    
    @Override
	public String toString() {
		return "Veterinário \nNome: " + getNome() + 
				"\nCPF: " + getCpf();
	}
    
}
