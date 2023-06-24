package org.uepb.entity;

public class Groomer extends Funcionario {
	private String especialidade;

	public Groomer(GroomerBuilder builder) {
		super(builder);
		this.especialidade = builder.especialidade;
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

	public static class GroomerBuilder extends FuncionarioBuilder<Groomer, GroomerBuilder> {
		private String especialidade;

		@Override
		protected GroomerBuilder self() {
			return this;
		}

		public GroomerBuilder especialidade(String especialidade) {
			this.especialidade = especialidade;
			return this;
		}

		@Override
		public Groomer build() {
			return new Groomer(this);
		}
	}
}
