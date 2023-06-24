package org.uepb.entity;

public class Groomer extends Funcionario {
	public Groomer(Builder builder) {
		super(builder);
	}

	@Override
	public String toString() {
		return "Groomer \nNome: " + getNome() +
				"\nEspecialidade: " + getEspecialidade() +
				"\nCPF: " + getCpf();
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder extends Funcionario.Builder<Groomer, Builder> {
		@Override
		protected Builder self() {
			return this;
		}

		@Override
		public Groomer build() {
			return new Groomer(this);
		}
	}
}
