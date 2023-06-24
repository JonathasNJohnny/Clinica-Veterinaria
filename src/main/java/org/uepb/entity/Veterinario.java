package org.uepb.entity;

public class Veterinario extends Funcionario {
	public Veterinario(Builder builder) {
		super(builder);
	}

	@Override
	public String toString() {
		return "Veterinário \nNome: " + getNome() +
				"\nEspecialidade: " + getEspecialidade() +
				"\nCPF: " + getCpf();
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder extends Funcionario.Builder<Veterinario, Builder> {
		@Override
		protected Builder self() {
			return this;
		}

		@Override
		public Veterinario build() {
			return new Veterinario(this);
		}
	}
}
