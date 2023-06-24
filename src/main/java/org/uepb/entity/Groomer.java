package org.uepb.entity;

public class Groomer extends Funcionario {
	private String especialidade;
	
	public Groomer(String nome, String cpf, String especialidade) {
		super(nome, cpf);
		this.especialidade = especialidade;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}



	@Override
	public String toString() {
		return "Groomer \nNome: " + getNome() + 
				"\nEspecialidade: " + especialidade + 
				"\nCPF: " + getCpf();
	}
    
}
