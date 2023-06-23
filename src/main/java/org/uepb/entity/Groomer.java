package org.uepb.entity;

public class Groomer extends Funcionario {
    public Groomer(String nome, String especialidade, String cpf) {
        super(nome, especialidade, cpf);
    }

	@Override
	public String toString() {
		return "Groomer \nNome: " + getNome() + 
				"\nEspecialidade: " + getEspecialidade() + 
				"\nCPF: " + getCpf();
	}
    
    
}
